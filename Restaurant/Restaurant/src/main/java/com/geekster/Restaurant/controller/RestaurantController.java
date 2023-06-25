package com.geekster.Restaurant.controller;

import com.geekster.Restaurant.model.Restaurant;
import com.geekster.Restaurant.service.RestaurantService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;

@RestController
@Validated
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @PostMapping("addRestaurant")
    public String addRestaurant(@RequestBody @Valid Restaurant restaurant)
    {
        return restaurantService.addRestaurant(restaurant);
    }
    @GetMapping("Restaurants")
    public List<Restaurant> getAllRestaurant()
    {
        return restaurantService.getAllRestaurant();
    }
    @GetMapping("Restaurant/{id}")
    public Restaurant getRestaurant(@PathVariable Integer id)
    {
        return restaurantService.getRestaurant(id);
    }
    @PutMapping("Update/{Id}/{Speciality}")
    public String updateRestaurant(@PathVariable Integer Id,@PathVariable String Speciality)
    {
        return restaurantService.updateRestaurant(Id,Speciality);
    }
    @DeleteMapping("Delete/{id}")
    public String delete(@PathVariable Integer id)
    {
        return restaurantService.delete(id);
    }

}
