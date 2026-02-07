package com.trendythreads.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trendythreads.inventory.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}

