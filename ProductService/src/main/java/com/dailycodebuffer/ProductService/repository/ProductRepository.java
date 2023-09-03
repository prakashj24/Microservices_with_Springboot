package com.dailycodebuffer.ProductService.repository;

import com.dailycodebuffer.ProductService.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
