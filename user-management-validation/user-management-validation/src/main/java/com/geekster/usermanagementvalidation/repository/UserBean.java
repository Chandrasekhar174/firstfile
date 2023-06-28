package com.geekster.usermanagementvalidation.repository;

import com.geekster.usermanagementvalidation.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class UserBean {

    @Bean
    public Map<Integer, User> getMap()
    {
        return new HashMap<>();
    }
}
