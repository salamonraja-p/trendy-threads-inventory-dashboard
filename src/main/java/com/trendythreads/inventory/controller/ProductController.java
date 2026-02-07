package com.trendythreads.inventory.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.trendythreads.inventory.model.Product;
import com.trendythreads.inventory.repository.ProductRepository;

@RestController
@CrossOrigin
public class ProductController {

    private final ProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return repo.findAll();
    }
}
