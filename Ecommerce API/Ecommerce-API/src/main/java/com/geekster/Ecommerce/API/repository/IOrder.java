package com.geekster.Ecommerce.API.repository;

import com.geekster.Ecommerce.API.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrder extends CrudRepository<Order,Long> {
}
