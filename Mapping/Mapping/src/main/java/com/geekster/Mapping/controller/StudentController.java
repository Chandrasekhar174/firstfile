package com.geekster.Mapping.controller;

import com.geekster.Mapping.model.Student;
import com.geekster.Mapping.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("addStudent")
    public void addStudent(@RequestBody Student student)
    {
        studentService.addStudent(student);
    }
    @DeleteMapping("Student/{id}")
    public void deleteStudent(@PathVariable Long id)
    {
        studentService.delete(id);
    }
    @PutMapping("UpdateStudentInfo/{id}")
    public void update(@PathVariable Long id,@RequestParam String phoneNumber)
    {
        studentService.update(id,phoneNumber);
    }
    @GetMapping("allStudents")
    public List<Student> getStudents()
    {
        return studentService.getAllStudents();
    }
}
