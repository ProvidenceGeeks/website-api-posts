package com.providencegeeks.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogPostsController {

  @RequestMapping(value = "/hello")
  public String helloWorld() {
    return "Hello World";
  }
}
