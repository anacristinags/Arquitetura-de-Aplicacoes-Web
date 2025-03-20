package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    // get
    public List<Product> getAllProducts() {
        return products;
    }

    // GET buscar por id
    

    // post
    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }
    
}
