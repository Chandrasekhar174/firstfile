package com.geekster.Ecommerce.API.controller;

import com.geekster.Ecommerce.API.model.Order;
import com.geekster.Ecommerce.API.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping("PlaceOrder")
    public String placeOrder(@RequestBody Order order) {
        return orderService.makeOrder(order);
    }
    @GetMapping("getOrder/{id}")
    public Optional<Order> getOrder(@PathVariable Long id)
    {
        return orderService.getOrder(id);
    }

}
