package com.app.muzix.controller;

import com.app.muzix.model.Favourite;
import com.app.muzix.service.FavouriteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@Slf4j
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

  @GetMapping("/check")
  public boolean checkFavourites(@RequestParam("albumId") String albumId, @RequestParam("userId") String userId){
    return this.favouriteService.checkFavourite(albumId, userId);
  }
}
