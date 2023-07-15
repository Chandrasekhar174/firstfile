package com.geekster.Mapping.service;

import com.geekster.Mapping.repository.ILaptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    ILaptop laptop;
}
