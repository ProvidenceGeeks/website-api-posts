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
    return blogPostDao.getBlogPosts().stream()
      .sorted((o1, o2) -> BlogPost.DateComparator.compare(o1, o2))
      .collect(Collectors.toList());
  }
}
