package com.providencegeeks.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.providencegeeks.model.BlogPost;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
public class BlogPostServiceImplTest {

  @Mock
  private BlogPostDao blogPostDao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  @Test
  public void testgetBlogPostsSortedByTime() throws Exception {

    ObjectMapper objectMapper = new ObjectMapper();

    List<BlogPost> blogPosts = objectMapper.readValue(getClass().getResource("/wordpress.json"), new TypeReference<List<BlogPost>>(){});

    List<BlogPost> expectedBlogPosts = blogPosts.stream()
      .sorted((o1, o2) -> BlogPost.DateComparator.compare(o1, o2))
      .collect(Collectors.toList());

    Mockito.when(blogPostDao.getBlogPosts())
      .thenReturn(blogPosts);

    BlogPostServiceImpl blogPostService = new BlogPostServiceImpl(blogPostDao);

    List<BlogPost> sortedBlogPosts = blogPostService.getBlogPostsSortedByTime();

    assertEquals(expectedBlogPosts, sortedBlogPosts);
  }
}