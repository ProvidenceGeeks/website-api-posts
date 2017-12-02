package com.providencegeeks.service;

import com.providencegeeks.model.BlogPost;

import java.util.List;

public interface BlogPostDao {
  List<BlogPost> getBlogPosts();
}
