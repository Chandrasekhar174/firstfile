package com.geekster.Mapping.service;

import com.geekster.Mapping.repository.ICourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    ICourse course;
}
