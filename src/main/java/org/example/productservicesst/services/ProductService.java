package org.example.productservicesst.services;

import org.example.productservicesst.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);


    List<Product> getAllProducts();
}
