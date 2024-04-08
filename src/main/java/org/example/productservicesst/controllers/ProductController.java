package org.example.productservicesst.controllers;

import org.example.productservicesst.dtos.FakeStoreProductDto;
import org.example.productservicesst.models.Product;
import org.example.productservicesst.services.FakeStoreProductService;
import org.example.productservicesst.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//This controller is capable to host HTTP API's
//localhost:6969/products = ProductController
@RestController
@RequestMapping("/products")
public class ProductController { //waiter
    private ProductService productService;
    ProductController(ProductService productService) {
        this.productService = productService;
    }

    //localhost:6969/products/10
      @GetMapping("/{id}")
      public Product getProductById(@PathVariable("id") Long id) {
          return productService.getProductById(id);
      }
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
