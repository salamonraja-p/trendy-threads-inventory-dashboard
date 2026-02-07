package com.trendythreads.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trendythreads.inventory.model.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
}

