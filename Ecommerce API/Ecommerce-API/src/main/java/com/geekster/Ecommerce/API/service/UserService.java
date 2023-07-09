package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.model.User;
import com.geekster.Ecommerce.API.repository.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUser iUser;

    public void addUsers(List<User> users) {
        iUser.saveAll(users);
    }

    public Optional<User> getUser(Long id) {

        return iUser.findById(id);
    }
}
