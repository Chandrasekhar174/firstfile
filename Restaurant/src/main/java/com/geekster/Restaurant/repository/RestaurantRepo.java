package com.geekster.Restaurant.repository;

import com.geekster.Restaurant.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class RestaurantRepo {

    @Autowired
    List<Restaurant> restaurantBean;
    public List<Restaurant> getRestaurant()
    {
        return restaurantBean;
    }
}
