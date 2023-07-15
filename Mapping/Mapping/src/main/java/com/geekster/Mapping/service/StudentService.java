package com.geekster.Mapping.service;

import com.geekster.Mapping.model.Student;
import com.geekster.Mapping.repository.IStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudent iStudent;


    public void addStudent(Student student) {
        iStudent.save(student);

    }

    public void delete(Long id) {
        iStudent.deleteById(id);
    }

    public void update(Long id, String phoneNumber) {
        iStudent.updateInfo(id,phoneNumber);
    }

    public List<Student> getAllStudents() {
        return iStudent.findAll();
    }
}
