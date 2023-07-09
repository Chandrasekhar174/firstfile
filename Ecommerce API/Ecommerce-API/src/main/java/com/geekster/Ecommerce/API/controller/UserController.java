package com.geekster.Ecommerce.API.controller;

import com.geekster.Ecommerce.API.model.User;
import com.geekster.Ecommerce.API.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("addUser")
    public void addUser(@RequestBody List<User> users)
    {
        userService.addUsers(users);
    }
    @GetMapping("getUser/{id}")
    public Optional<User> getUser(@PathVariable Long id)
    {
        return userService.getUser(id);
    }
}
