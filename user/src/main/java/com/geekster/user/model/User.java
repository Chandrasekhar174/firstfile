package com.geekster.user.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    private Integer userId;
    private String name;
    private String userName;
    private String address;
    private Long phoneNumber;


}
