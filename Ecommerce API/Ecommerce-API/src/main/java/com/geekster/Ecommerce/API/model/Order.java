package com.geekster.Ecommerce.API.model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Order {
    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name="fk_UserId")
    private User user;

    @ManyToMany
    @JoinTable(name = "fk_orderId_productId",joinColumns =@JoinColumn(name="fk_orderId"),inverseJoinColumns = @JoinColumn(name = "fk_productId"))
    private List<Product> products;
    @OneToOne
    @JoinColumn(name = "fk_addressId")
    private Address address;
    private Integer productQuantity;

}
