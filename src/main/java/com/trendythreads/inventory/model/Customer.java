package com.trendythreads.inventory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Customer {

    @Id
    private int id;
    private String name;
    private String city;
}
