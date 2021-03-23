package com.app.muzix.controller;

import com.app.muzix.model.Favourite;
import com.app.muzix.service.FavouriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class FovouriteController {

  @Autowired
  FavouriteService favouriteService;

  @PostMapping("/add")
  public Favourite addToFavourite(@RequestBody Favourite fav){
    return this.favouriteService.addToFavourites(fav);
  }

  @GetMapping("/get/{userId}")
  public ArrayList<Favourite> getFavourites(@PathVariable String userId){
    return this.favouriteService.getFavourites(userId);
  }

  @GetMapping("/check/{id}")
  public boolean checkFavourites(@PathVariable String id){
    return this.favouriteService.checkFavourite(id);
  }
}
