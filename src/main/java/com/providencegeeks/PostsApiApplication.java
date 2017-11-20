package com.providencegeeks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PostsApiApplication {

	public static void main(String[] args) { SpringApplication.run(PostsApiApplication.class, args); }

}
