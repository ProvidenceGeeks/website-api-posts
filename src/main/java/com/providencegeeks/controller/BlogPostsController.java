package com.providencegeeks.controller;

import com.providencegeeks.model.BlogPost;
import com.providencegeeks.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogPostsController {
  private final BlogPostService blogPostService;

  @Autowired
  public BlogPostsController(BlogPostService blogPostService) {
    this.blogPostService = blogPostService;
  }

  @RequestMapping(value = "api/posts", method = RequestMethod.GET, produces = "application/json")
  public List<BlogPost> getBlogPosts()
  {
    return blogPostService.getBlogPostsSortedByTime();
  }
}
