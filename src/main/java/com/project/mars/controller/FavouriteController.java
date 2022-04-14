package com.project.mars.controller;

import com.project.mars.service.FavouriteService;
import com.project.mars.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api", method = RequestMethod.GET)
@CrossOrigin
public class FavouriteController {

    @Autowired
    FavouriteService favouriteService;

    @GetMapping("/add_favourite/{id}")
    public Result add(@PathVariable("id") Long id) {
        return favouriteService.addFavouriteImages(id);
    }

    @GetMapping("/delete_favourite/{id}")
    public Result delete(@PathVariable("id") Long id) {

        return favouriteService.deleteFavouriteImages(id);
    }

    @GetMapping("/get_favourite/{id}")
    public Result get(@PathVariable("id") Long id) {
        return favouriteService.getFavouriteImages(id);
    }
}
