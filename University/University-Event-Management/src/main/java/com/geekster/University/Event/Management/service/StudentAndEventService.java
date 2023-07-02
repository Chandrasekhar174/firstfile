package com.geekster.University.Event.Management.service;

import com.geekster.University.Event.Management.model.Department;
import com.geekster.University.Event.Management.model.Event;
import com.geekster.University.Event.Management.model.Student;
import com.geekster.University.Event.Management.repository.EventRepo;
import com.geekster.University.Event.Management.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class StudentAndEventService {
    @Autowired
    StudentRepo studentRepo;
    @Autowired
    EventRepo eventRepo;
    public String addStudent(Student student) {
        studentRepo.save(student);
        return "add Successfully";
    }

    public String updateStudent(Long id, Department department){
        Optional<Student> student=studentRepo.findById(id);
        Student student1=null;
        if(student.isPresent())
        {
            student1=student.get();
        }
        else{
            return "id not found";
        }
        student1.setDepartment(department);
        studentRepo.save(student1);
        return "Update successfully";
    }

    public String delete(Long id) {
        studentRepo.deleteById(id);
        return "delete successfully";
    }

    public Iterable<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    public Optional<Student> studentById(Long id) {
        return studentRepo.findById(id);
    }
    public String addEvent(Event event)
    {
        eventRepo.save(event);
        return "Add successfully";
    }

    public String updateEvent(Long id, String location) {
        Optional<Event> optionalEvent=eventRepo.findById(id);
        Event event=null;
        if(optionalEvent.isPresent())
        {
            event=optionalEvent.get();
        }
        else
        {
            return "Id not found";
        }
        event.setLocationOfEvent(location);
        eventRepo.save(event);
        return "Update successfully";
    }

    public String deleteEvent(Long id) {
        eventRepo.deleteById(id);
        return "Delete Successfully";
    }

    public Event getAllEvent(Date date) {

        return eventRepo.getEventByDate(date);
    }
}
