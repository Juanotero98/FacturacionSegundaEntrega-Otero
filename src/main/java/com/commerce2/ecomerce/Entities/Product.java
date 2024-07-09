package com.commerce2.ecomerce.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long id;
    @Getter @Setter private String name;
    @Getter @Setter private Double price;
}
