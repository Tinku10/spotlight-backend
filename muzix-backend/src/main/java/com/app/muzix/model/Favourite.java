package com.app.muzix.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document("Favourite")
public class Favourite {

  @Id
  private String id;
  private String albumId;
  private String name;
  private String image;
  private ArrayList<String> artists;
  private String userId;

  public Favourite(String id, String albumId, String name, String image, ArrayList<String> artists, String userId) {
    this.id = id;
    this.albumId = albumId;
    this.name = name;
    this.image = image;
    this.artists = artists;
    this.userId = userId;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getAlbumId() {
    return albumId;
  }

  public void setAlbumId(String albumId) {
    this.albumId = albumId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public ArrayList<String> getArtists() {
    return artists;
  }

  public void setArtists(ArrayList<String> artists) {
    this.artists = artists;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }
}
