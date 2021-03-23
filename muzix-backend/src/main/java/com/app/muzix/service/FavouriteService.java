package com.app.muzix.service;

import com.app.muzix.model.Favourite;
import com.app.muzix.repository.FavouriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class FavouriteService {

  @Autowired
  FavouriteRepository repository;

  public ArrayList<Favourite> getFavourites(String userId){
    return repository.findByUsername(userId);
  }

  public Favourite addToFavourites(Favourite f){
    return repository.save(f);
  }

  public boolean checkFavourite(String id){
    return this.repository.findByAlbumId(id);
  }
}
