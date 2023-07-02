package com.geekster.job.service;

import com.geekster.job.model.StudentJobModel;
import com.geekster.job.repository.StudentJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentJobService {
    @Autowired
    StudentJobRepo studentJobRepo;

    public Iterable<StudentJobModel> getAll() {
        return studentJobRepo.findAll();
    }

    public String postJob(StudentJobModel studentJobModel) {
        studentJobRepo.save(studentJobModel);
        return "Job added";
    }

    public String UpdateJob(Long id, Double salary, String companyName) {
        studentJobRepo.update(id,salary,companyName);
        return "update successfully";
    }
}
