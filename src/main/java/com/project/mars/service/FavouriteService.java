package com.project.mars.service;

import com.project.mars.vo.Result;

public interface FavouriteService {
    Result getFavouriteImages(Long id);
    Result deleteFavouriteImages(Long id);
    Result addFavouriteImages(Long id);
}
