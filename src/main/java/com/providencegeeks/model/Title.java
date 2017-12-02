package com.providencegeeks.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Title {
  @JsonProperty("rendered")
  private String rendered;

  public String getRendered() {
    return rendered;
  }

  public void setRendered(String rendered) {
    this.rendered = rendered;
  }
}
