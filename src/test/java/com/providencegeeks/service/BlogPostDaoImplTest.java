package com.providencegeeks.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.providencegeeks.config.BlogPostConfig;
import com.providencegeeks.model.BlogPost;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.List;

import static org.junit.Assert.*;

public class BlogPostDaoImplTest {

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  @Mock
  private BlogPostConfig blogPostConfig;

  @Before
  public void setUp() throws Exception {
    Mockito.when(blogPostConfig.getFileUri())
      .then(i -> getClass().getResource("/wordpress.json").toURI());
  }

  @Test
  public void getBlogPosts() throws Exception {

    ObjectMapper objectMapper = new ObjectMapper();

    BlogPostDaoImpl blogPostDaoImpl = new BlogPostDaoImpl(objectMapper, blogPostConfig);
    List<BlogPost> actualBlogPosts = blogPostDaoImpl.getBlogPosts();

    assertEquals(actualBlogPosts.size(), 2);
  }

}