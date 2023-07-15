package com.geekster.Mapping.repository;

import com.geekster.Mapping.model.Course;
import com.geekster.Mapping.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourse extends JpaRepository<Course,Integer> {
}
