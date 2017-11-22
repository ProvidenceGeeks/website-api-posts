package com.providencegeeks.service;

import com.providencegeeks.model.BlogPost;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BlogPostServiceImpl implements BlogPostService {
  private BlogPostDao blogPostDao;

  public BlogPostServiceImpl(BlogPostDao blogPostDao) {
    this.blogPostDao = blogPostDao;
  }

  @Override
  public List<BlogPost> getBlogPostsSortedByTime() {
    return blogPostDao.getBlogPosts().stream().collect(Collectors.toList());
    // return blogPostDao.getBlogPosts().stream().sorted((o1, o2) -> Long.compare(o1.getTime(), o2.getTime())).collect(Collectors.toList());
  }
}
