package com.providencegeeks.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.net.URI;
import java.net.URISyntaxException;

@Configuration
public class BlogPostConfig {

  @Value("${blogPost.file}")
  private String blogPostFileUri;

  public URI getFileUri(){
    try {
      return new URI(blogPostFileUri);
    } catch (URISyntaxException e) {
      throw new RuntimeException(e);
    }
  }
}
