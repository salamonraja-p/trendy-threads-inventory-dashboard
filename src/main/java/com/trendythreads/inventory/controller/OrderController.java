package com.trendythreads.inventory.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.trendythreads.inventory.model.OrderEntity;
import com.trendythreads.inventory.repository.OrderRepository;

@RestController
@CrossOrigin
public class OrderController {

    private final OrderRepository repo;

    public OrderController(OrderRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/orders")
    public List<OrderEntity> getOrders() {
        return repo.findAll();
    }
}
