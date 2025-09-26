package com.example.StorLine.controller;

import com.example.StorLine.dtos.GetProduct;
import com.example.StorLine.dtos.PostProduct;
import com.example.StorLine.dtos.PutProduct;
import com.example.StorLine.entity.Product;
import com.example.StorLine.service.ProductService;
import com.example.StorLine.tools.ProductMapper;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/v1")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getProducts")
    public ResponseEntity<List<Product>> getAll() {
        List<Product> products = productService.findAll();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/getById/{id}")
    public Product findById(@PathVariable("id") Integer id) {
        return productService.findById(id);
    }

    @PostMapping("/saveProduct")
    public ResponseEntity<Product> saveProduct(@Valid @RequestBody Product postProduct) {
        Product product = productService.save(postProduct);
        return ResponseEntity.ok().body(product);
    }

    @PutMapping("/uodate/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable ("id") Integer id ,@Valid @RequestBody Product upProduct) {
       Product product = productService.update(id, upProduct);
        return ResponseEntity.ok().body(product);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Integer id) {
        productService.deleteById(id);
    }




}
