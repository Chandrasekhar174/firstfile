package com.geekster.user.service;

import com.geekster.user.model.User;
import com.geekster.user.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    userRepo userRepos;


    public String User(User user) {
        userRepos.getUsers().add(user);
        return "User Added";
    }

    public List<User> getUser(Integer userId) {
        List<User>li=new ArrayList<>();
        for(User user:userRepos.getUsers())
        {
            if(user.getUserId().equals(userId))
            {
                li.add(user);
                break;
            }
        }
        return li;
    }

    public List<User> getAllUser() {
        return userRepos.getUsers();
    }

    public String update(Integer id, String name, String userName, String address, Long phoneNumber) {

        for(User user:userRepos.getUsers())
        {
            if(user.getUserId().equals(id))
            {
                user.setName(name);
                user.setUserName(userName);
                user.setAddress(address);
                user.setPhoneNumber(phoneNumber);
            }
        }
        return "Update Successfully";
    }

    public String delete(Integer id) {

        for(User user:userRepos.getUsers())
        {
            if(user.getUserId().equals(id))
            {
                userRepos.getUsers().remove(user);
                return user.getUserId()+" Delete Successfully";
            }
        }
        return id+" delete";
    }
}
