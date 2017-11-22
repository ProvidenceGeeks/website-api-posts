package com.providencegeeks;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.providencegeeks.model.HealthCheck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PostsApiApplication {

	public static void main(String[] args) { SpringApplication.run(PostsApiApplication.class, args); }

}
