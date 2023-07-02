package com.geekster.University.Event.Management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    @Id
    private long studentId;
    @Pattern(regexp = "[A-Z][a-zA-Z]*", message = "Name should start with a capital letter")
    private String firstName;
    private String lastName;
    @Min(18)
    @Max(25)
    private Integer age;
    @Enumerated(EnumType.STRING)
    private Department department;
}
