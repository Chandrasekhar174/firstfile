package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.model.Order;
import com.geekster.Ecommerce.API.repository.IOrder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    IOrder iOrder;

    public String makeOrder(Order order) {
        iOrder.save(order);
        return "Order Placed";
    }

    public Optional<Order> getOrder(Long id) {
        return iOrder.findById(id);
    }
}
