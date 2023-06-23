package com.geekster.user.repository;

import com.geekster.user.model.User;
import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class userBean {

    @Bean
    public List<User> getUser()
    {
        return new ArrayList<>();
    }
}
