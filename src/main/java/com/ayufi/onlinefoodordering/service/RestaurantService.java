package com.ayufi.onlinefoodordering.service;

import com.ayufi.onlinefoodordering.dto.RestaurantDto;
import com.ayufi.onlinefoodordering.model.Restaurant;
import com.ayufi.onlinefoodordering.model.User;
import com.ayufi.onlinefoodordering.request.CreateRestaurantRequest;
import lombok.Data;

import java.util.List;


public interface RestaurantService {
    public Restaurant createRestaurant(CreateRestaurantRequest req, User user);

    public Restaurant updateRestaurant(Long restaurantId,CreateRestaurantRequest updateRestaurant) throws Exception;

    public void deleteRestaurant(Long restaurantId) throws Exception;

    public List<Restaurant> getAllRestaurant();

    public List<Restaurant> searchRestaurant(String keyword);

    public Restaurant findRestaurantById(Long id) throws Exception;

    public Restaurant getRestaurantById(Long userId) throws Exception;

    public RestaurantDto addToFavoritres(Long restaurantId,User user) throws Exception;

    public Restaurant updateRestaurantStatus(Long id) throws Exception;



}
