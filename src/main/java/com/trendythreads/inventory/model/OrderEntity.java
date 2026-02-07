package com.trendythreads.inventory.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class OrderEntity {

    @Id
    private int orderId;
    private int customerId;
    private int productId;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private String status;
}

