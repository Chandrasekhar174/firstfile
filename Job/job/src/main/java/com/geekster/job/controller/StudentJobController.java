package com.geekster.job.controller;

import com.geekster.job.model.StudentJobModel;
import com.geekster.job.service.StudentJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentJobController {
    @Autowired
    StudentJobService studentJobService;
    @GetMapping("GetAllInfomation")
    public Iterable<StudentJobModel> getAll()
    {
        return studentJobService.getAll();
    }
    @PostMapping("PostJob")
    public String postJob(@RequestBody StudentJobModel studentJobModel)
    {
        return studentJobService.postJob(studentJobModel);
    }
    @PutMapping("UpdateJob/{id}")
    public String UpdateJob(@PathVariable Long id,@RequestParam Double salary,@RequestParam String companyName)
    {
        return studentJobService.UpdateJob(id,salary,companyName);
    }

}
