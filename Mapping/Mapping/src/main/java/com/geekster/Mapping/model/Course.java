package com.geekster.Mapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    private String duration;

    @ManyToMany
    @JoinTable(name = "fk_courseId_studentId",joinColumns = @JoinColumn(name = "fk_courseId"),inverseJoinColumns = @JoinColumn(name = "studentId"))
    List<Student> studentList;
}
