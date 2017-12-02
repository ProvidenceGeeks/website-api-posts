package com.providencegeeks.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Excerpt {
  @JsonProperty("rendered")
  private String rendered;

  @JsonProperty("protected")
  private boolean isProtected;
}
