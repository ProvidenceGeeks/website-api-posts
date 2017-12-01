package com.providencegeeks.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MediaDetails {

  @JsonProperty("thumbnail")
  private MediaData thumbnail;

  @JsonProperty("medium")
  private MediaData medium;

  @JsonProperty("medium_large")
  private MediaData medium_large;

  @JsonProperty("large")
  private MediaData large;

  @JsonProperty("full")
  private MediaData full;

  public MediaData getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(MediaData thumbnail) {
    this.thumbnail = thumbnail;
  }

  public MediaData getMedium() {
    return medium;
  }

  public void setMedium(MediaData medium) {
    this.medium = medium;
  }

  public MediaData getMedium_large() {
    return medium_large;
  }

  public void setMedium_large(MediaData medium_large) {
    this.medium_large = medium_large;
  }

  public MediaData getLarge() {
    return large;
  }

  public void setLarge(MediaData large) {
    this.large = large;
  }

  public MediaData getFull() {
    return full;
  }

  public void setFull(MediaData full) {
    this.full = full;
  }
}
