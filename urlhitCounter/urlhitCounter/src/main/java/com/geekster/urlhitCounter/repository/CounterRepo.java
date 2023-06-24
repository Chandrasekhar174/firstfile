package com.geekster.urlhitCounter.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class CounterRepo {

    @Autowired
    Map<String,Integer> hm;
    public Map<String,Integer> getMap()
    {
        return hm;
    }

}
