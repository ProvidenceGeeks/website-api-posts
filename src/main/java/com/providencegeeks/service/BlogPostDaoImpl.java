package com.providencegeeks.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.providencegeeks.config.BlogPostConfig;
import com.providencegeeks.model.BlogPost;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class BlogPostDaoImpl implements BlogPostDao {

  private final ObjectMapper objectMapper;
  private final BlogPostConfig blogPostConfig;

  public BlogPostDaoImpl(ObjectMapper objectMapper, BlogPostConfig blogPostConfig) {
    this.objectMapper = objectMapper;
    this.blogPostConfig = blogPostConfig;
  }

  @Override
  public List<BlogPost> getBlogPosts() {
    try {
      return objectMapper.readValue(
        blogPostConfig.getFileUri().toURL(),
        new TypeReference<List<BlogPost>>(){});
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }
}