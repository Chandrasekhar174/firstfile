package com.geekster.Emp.and.Address.model;

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
public class Employee {
    @Id
    private Long empId;
    private String empFirstName;
    private String empLastName;
    @OneToOne
    @JoinColumn(name = "fk_AddressId")
    Address address;

}
