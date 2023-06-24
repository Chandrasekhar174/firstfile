package com.geekster.urlhitCounter.model;


import org.springframework.stereotype.Component;

@Component
public class CounterModel {
    private Integer count=0;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
