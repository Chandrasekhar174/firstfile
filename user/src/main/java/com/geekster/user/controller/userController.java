package com.geekster.user.controller;

import com.geekster.user.model.User;
import com.geekster.user.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.SplittableRandom;

@RestController
public class userController {

    @Autowired
    Service service;
    @PostMapping("addUser")
    public String addUser(@RequestBody User user)
    {
        return service.User(user);
    }
    @GetMapping("getUser/{userId}")
    public List<User> getUser(@PathVariable Integer userId)
    {
        return service.getUser(userId);
    }
    @GetMapping("getAllUser")
    public List<User> getAllUser()
    {
        return service.getAllUser();
    }
    @PutMapping("Update/{id}")
    public String update(@PathVariable Integer id, @RequestParam String name, @RequestParam String userName,@RequestParam String address,@RequestParam Long phoneNumber)
    {
        return service.update(id,name,userName,address,phoneNumber);
    }
    @DeleteMapping("deleteUser/{id}")
    public String delete(@PathVariable Integer id)
    {
        return service.delete(id);
    }
}
