package com.providencegeeks.service;

import com.providencegeeks.model.BlogPost;

import Java.util.List;

public interface BlogPostService {
  List<BlogPost> getBlogPostsSortedByTime();
}
