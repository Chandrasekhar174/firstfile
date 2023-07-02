package com.geekster.job.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.lang.model.element.Name;
import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Student")
public class StudentJobModel {
    @Id
    private Long id;
    private String title;
    private String description;
    private  String location;
    @Min(20000)
    private Double salary;
    private String companyName;
    private String employerName;
    @Enumerated(EnumType.STRING)
    private JobType jobType;
    @JsonFormat(pattern ="DD/MM/YYYY")
    private Date appliedDate;
}
