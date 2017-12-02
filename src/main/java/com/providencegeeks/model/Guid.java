package com.providencegeeks.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Guid {
  @JsonProperty("rendered")
  private String rendered;
}
