package com.geekster.urlhitCounter.service;

import com.geekster.urlhitCounter.model.CounterModel;
import com.geekster.urlhitCounter.repository.CounterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UrlHitService {

    @Autowired
    CounterModel counterModel;
    @Autowired
    CounterRepo counterRepo;

    public Map<String,Integer> getMap()
    {
        return counterRepo.getMap();
    }
    public Integer getHitCount()
    {
        return counterModel.getCount();
    }


    public Integer getCounter(String userName) {
        Map<String,Integer> hm=getMap();
        hm.put(userName,hm.getOrDefault(userName,0)+1);
        counterModel.setCount(counterModel.getCount()+1);

        return hm.get(userName);
    }


}
