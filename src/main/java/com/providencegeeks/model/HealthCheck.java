package com.providencegeeks.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HealthCheck {

  @JsonProperty("status")
  private int status;

  @JsonProperty("message")
  private String message;

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}