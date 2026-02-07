package com.trendythreads.inventory.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.trendythreads.inventory.model.Customer;
import com.trendythreads.inventory.repository.CustomerRepository;

@RestController
@CrossOrigin
public class CustomerController {

    private final CustomerRepository repo;

    public CustomerController(CustomerRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return repo.findAll();
    }
}
