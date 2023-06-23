package com.geekster.user.repository;

import com.geekster.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class userRepo {
    @Autowired
    List<User> users;
    public List<User> getUsers()
    {
        return users;
    }


}
