package com.geekster.usermanagementvalidation.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Timer;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {


    private Integer userid;
    @NotBlank
    private String userName;
    @JsonFormat(pattern = "dd-mm-yyyy")
    private Date dataOfBath;

    @Email
    private String email;

    @Pattern(regexp = "^\\+[1-9]\\d{1,2}\\d{9}$",message = "Invalid phone Number")
    private String phoneNumber;
    @JsonFormat(pattern = "dd/mm/yyyy HH:MM:SS")
    private Date date;
//    @JsonFormat(pattern ="HH:MM:SS")
//    private DateTimeFormat time;

}
