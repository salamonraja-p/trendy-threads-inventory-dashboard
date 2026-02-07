package com.trendythreads.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trendythreads.inventory.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}

