package com.geekster.urlhitCounter.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CounterBean {

    @Bean
    public Map<String,Integer> getMap()
    {
        return new HashMap<>();
    }
}
