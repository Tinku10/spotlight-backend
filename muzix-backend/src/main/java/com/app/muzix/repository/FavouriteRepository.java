package com.app.muzix.repository;

import com.app.muzix.model.Favourite;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface FavouriteRepository extends MongoRepository<Favourite, String> {
  public ArrayList<Favourite> findByUsername(String username);

  public boolean findByAlbumId(String id);
}
