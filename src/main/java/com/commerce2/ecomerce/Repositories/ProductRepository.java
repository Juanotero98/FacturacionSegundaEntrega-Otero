package com.commerce2.ecomerce.Repositories;

import com.commerce2.ecomerce.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
