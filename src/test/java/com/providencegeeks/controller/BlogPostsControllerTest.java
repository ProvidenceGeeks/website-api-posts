
package com.providencegeeks.controller;

import com.providencegeeks.model.BlogPost;
import com.providencegeeks.service.BlogPostService;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
public class BlogPostsControllerTest {

  @Mock
  private BlogPostService blogPostService;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  @Test
  public void testgetBlogPosts() {

    List<BlogPost> testPosts = Collections.emptyList();

    Mockito.when(blogPostService.getBlogPostsSortedByTime())
      .thenReturn(testPosts);

    BlogPostsController postsController = new BlogPostsController(blogPostService);
    List<BlogPost> posts = postsController.getBlogPosts();

     Mockito.verify(blogPostService).getBlogPostsSortedByTime();

    assertEquals(testPosts, posts);
  }
}



