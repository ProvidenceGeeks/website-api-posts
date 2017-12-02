package com.providencegeeks.service;

import com.providencegeeks.model.BlogPost;

import java.util.List;

public interface BlogPostService {
  List<BlogPost> getBlogPostsSortedByTime();
}
