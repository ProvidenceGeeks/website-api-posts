package com.providencegeeks.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MediaData {

  @JsonProperty("file")
  private String file;

  @JsonProperty("width")
  private int width;

  @JsonProperty("height")
  private int height;

  @JsonProperty("mime_type")
  private String mime_type;

  @JsonProperty("source_url")
  private String source_url;

  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public String getMime_type() {
    return mime_type;
  }

  public void setMime_type(String mime_type) {
    this.mime_type = mime_type;
  }

  public String getSource_url() {
    return source_url;
  }

  public void setSource_url(String source_url) {
    this.source_url = source_url;
  }
}