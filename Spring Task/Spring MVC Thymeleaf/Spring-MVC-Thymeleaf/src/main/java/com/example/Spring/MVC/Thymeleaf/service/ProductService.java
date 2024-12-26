package com.example.Spring.MVC.Thymeleaf.service;

import com.example.Spring.MVC.Thymeleaf.entity.Product;
import com.example.Spring.MVC.Thymeleaf.repository.ProductRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Add a product
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    // Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}