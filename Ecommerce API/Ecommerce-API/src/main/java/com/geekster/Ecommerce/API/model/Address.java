package com.geekster.Ecommerce.API.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    private Long id;
    private String name;
    private  String landMark;
    private String phoneNumber;
    private String zipcode;
    private String state;
    @OneToOne
    @JoinColumn(name = "fk_userId")
    private User user;
}
