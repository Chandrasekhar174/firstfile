package com.geekster.University.Event.Management.controller;

import com.geekster.University.Event.Management.model.Department;
import com.geekster.University.Event.Management.model.Event;
import com.geekster.University.Event.Management.model.Student;
import com.geekster.University.Event.Management.service.StudentAndEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentAndEventController {
    @Autowired
    StudentAndEventService studentAndEventService;
    @PostMapping("addStudent")
    public String addStudent(@RequestBody Student student)
    {
        return studentAndEventService.addStudent(student);
    }
    @PutMapping("update/{id}/{department}")
    public String updateStudent(@PathVariable Long id,@PathVariable Department department)
    {
        return studentAndEventService.updateStudent(id,department);
    }
    @DeleteMapping("delete/{id}")
    public String deleteStudent(@PathVariable Long id)
    {
        return studentAndEventService.delete(id);
    }
    @GetMapping("AllStudent")
    public Iterable<Student> getAllStudent()
    {
        return studentAndEventService.getAllStudent();
    }
    @GetMapping("findbyId/{id}")
    public Optional<Student> findStudent(@PathVariable Long id)
    {
        return studentAndEventService.studentById(id);
    }
    @PostMapping("Event")
    public String addEvent(@RequestBody Event event)
    {
        return studentAndEventService.addEvent(event);
    }
    @PutMapping("UpdateEvent/{id}/{Location}")
    public String UpdateEvent(@PathVariable Long id,@PathVariable String Location)
    {
        return studentAndEventService.updateEvent(id,Location);
    }
    @DeleteMapping("DeleteEvent/{id}")
    public String deleteEvent(@PathVariable Long id)
    {
        return studentAndEventService.deleteEvent(id);
    }
    @GetMapping("getEvent")
    public Event getEvent(@RequestParam Date date)
    {
        return studentAndEventService.getAllEvent(date);
    }
}
