package com.geekster.usermanagementvalidation.controller;

import com.geekster.usermanagementvalidation.model.User;
import com.geekster.usermanagementvalidation.service.ServiceUser;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@Validated
public class UserController {

    @Autowired
    ServiceUser serviceUser;
    @PostMapping("AddUser")
    public String AddUser(@RequestBody @Valid User user)
    {
        return serviceUser.addUser(user);
    }
    @GetMapping("allUser")
    public Map<Integer,User> getAllUser()
    {
        return serviceUser.getAllUser();
    }
    @GetMapping("user/{id}")
    public User getUser(@PathVariable Integer id)
    {
        return serviceUser.getUser(id);
    }
    @PutMapping("Update/{id}")
    public String update(@Valid @PathVariable Integer id, @Valid @RequestParam String email,@Valid @RequestParam String phone_number)
    {
        return serviceUser.update(id,email,phone_number);
    }
    @DeleteMapping("Delete/{id}")
    public String delete(@PathVariable Integer id)
    {
        return serviceUser.Delete(id);
    }



}
