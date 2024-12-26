package com.example.Spring.MVC.Thymeleaf.repository;

import com.example.Spring.MVC.Thymeleaf.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // You can define custom queries here if needed
}
