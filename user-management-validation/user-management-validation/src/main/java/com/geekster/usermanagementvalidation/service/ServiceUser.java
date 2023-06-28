package com.geekster.usermanagementvalidation.service;

import com.geekster.usermanagementvalidation.model.User;
import com.geekster.usermanagementvalidation.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ServiceUser {
    @Autowired
    UserRepo userRepo;

    public String addUser(User user) {

        Map<Integer,User>hm=getAllUser();
        if(!hm.containsKey(user.getUserid()))
        {
            hm.put(user.getUserid(),user);
            return "Insert Successfully";
        }
        return "Duplicate Not Allowed";
    }

    public Map<Integer,User> getAllUser()
    {
        return userRepo.getUserMap();
    }

    public User getUser(Integer id) {
        Map<Integer,User>hm=getAllUser();
        if(hm.containsKey(id))
        {
            return hm.get(id);
        }
        throw new IllegalStateException("Id not found");
    }

    public String update(Integer id, String email, String phone_number) {
        Map<Integer,User>hm=getAllUser();
        if(hm.containsKey(id))
        {
            User user= hm.get(id);
            user.setEmail(email);
            user.setPhoneNumber(phone_number);
            hm.put(id,user);
            return "Update Successfully";
        }
        return "id not found";
    }

    public String Delete(Integer id) {
        Map<Integer,User>hm=getAllUser();
        if(hm.containsKey(id))
        {
            hm.remove(id);
            return "Delete "+id+"successfully";
        }
        return "Invalid Id";
    }
}
