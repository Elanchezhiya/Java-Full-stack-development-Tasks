package com.example.Spring.MVC.Thymeleaf.controller;

import com.example.Spring.MVC.Thymeleaf.entity.Product;
import com.example.Spring.MVC.Thymeleaf.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    // Display options menu
    @GetMapping("/")
    public String home() {
        return "home"; // Corresponds to your home HTML page
    }

    // Display all products
    @GetMapping("/displayProducts")
    public String getAllProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "displayProducts"; // Corresponds to your product list HTML page
    }

    // Serve Add Product form
    @GetMapping("/addProduct")
    public String showAddProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "addProduct"; // Corresponds to your add product HTML page
    }

    // Handle Add Product form submission
    @PostMapping("/addProduct")
    public String saveProduct(@ModelAttribute Product product) {
        productService.addProduct(product);
        return "redirect:/displayProducts"; // Redirect to product list
    }

}
