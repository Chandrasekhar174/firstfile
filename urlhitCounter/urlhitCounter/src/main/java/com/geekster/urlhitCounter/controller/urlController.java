package com.geekster.urlhitCounter.controller;

import com.geekster.urlhitCounter.service.UrlHitService;
import org.apache.catalina.webresources.StandardRoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("api/v1/visitor-count-app")
public class urlController {

    @Autowired
    public UrlHitService urlHitService;
    @GetMapping("count")
    public Integer getHitCount()
    {
        return urlHitService.getHitCount();
    }
    @GetMapping("api/v1/visitor-count-app/{userName}")
    public Integer getCounter(@PathVariable String userName)
    {

        return urlHitService.getCounter(userName);
    }


}
