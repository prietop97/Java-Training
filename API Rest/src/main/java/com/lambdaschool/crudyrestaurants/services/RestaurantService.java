package com.lambdaschool.crudyrestaurants.services;

import com.lambdaschool.crudyrestaurants.models.Restaurant;

import java.util.List;

public interface RestaurantService {
    List<Restaurant> findAll();

    Restaurant findById(long id);

    Restaurant save(Restaurant restaurant);

    Restaurant update(Restaurant restaurant, long id);

    void delete(long id);
}
