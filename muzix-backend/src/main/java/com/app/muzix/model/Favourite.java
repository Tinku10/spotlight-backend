package com.app.muzix.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Favourite")
public class Favourite {

  @Id
  private String id;
  private String name;
  private String album;
  private String albumId;
  private String url;
  private String username;

  public Favourite(String id, String name, String album, String albumId, String url, String username) {
    this.id = id;
    this.name = name;
    this.album = album;
    this.albumId = albumId;
    this.url = url;
    this.username = username;
  }

  public String getAlbumId() {
    return albumId;
  }

  public void setAlbumId(String albumId) {
    this.albumId = albumId;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAlbum() {
    return album;
  }

  public void setAlbum(String album) {
    this.album = album;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

}
