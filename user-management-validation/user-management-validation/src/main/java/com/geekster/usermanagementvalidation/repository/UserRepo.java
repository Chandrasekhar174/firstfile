package com.geekster.usermanagementvalidation.repository;

import com.geekster.usermanagementvalidation.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UserRepo {

    @Autowired
    Map<Integer,User> userMap;
    public Map<Integer,User> getUserMap()
    {
        return userMap;
    }
}
