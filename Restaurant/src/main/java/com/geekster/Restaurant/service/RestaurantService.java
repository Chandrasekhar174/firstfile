package com.geekster.Restaurant.service;

import com.geekster.Restaurant.model.Restaurant;
import com.geekster.Restaurant.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;
    HashSet<Integer>hs;
    public RestaurantService() {
        hs=new HashSet<>();
    }
    public List<Restaurant> getAllRestaurant()
    {
        return restaurantRepo.getRestaurant();
    }

    public String addRestaurant(Restaurant restaurant){

        if(!hs.contains(restaurant.getRestaurantId()))
        {
            List<Restaurant>list=getAllRestaurant();
            list.add(restaurant);
            hs.add(restaurant.getRestaurantId());
            return "Insert Successfully";
        }
        return "This RestaurantId already done";
    }


    public Restaurant getRestaurant(Integer id) {

        List<Restaurant>list=getAllRestaurant();
        for(Restaurant restaurant:list)
        {
            if(restaurant.getRestaurantId().equals(id))
            {
                return restaurant;
            }
        }
        throw new IllegalStateException("Id not found");
    }

    public String updateRestaurant(Integer Id,String Speciality)
    {
        List<Restaurant> restaurants=getAllRestaurant();
        for(Restaurant restaurant:restaurants)
        {
            if(restaurant.getRestaurantId().equals(Id))
            {
                restaurant.setSpecialty(Speciality);
                return "Update Successfully";
            }
        }
        return "Invalid Id";
    }

    public String delete(Integer id) {

        List<Restaurant>list=getAllRestaurant();
        for(Restaurant restaurant:list)
        {
            if(restaurant.getRestaurantId().equals(id))
            {
                list.remove(restaurant);
                hs.remove(id);
                return id+" Deleted !!!!!!";
            }
        }
        return "id not found";
    }
}
