package com.example.StorLine.controller;

import com.example.StorLine.dtos.GetProduct;
import com.example.StorLine.service.ProductService;
import com.example.StorLine.tools.ProductMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    private final ProductService productService;
    private final ProductMapper  productMapper;

    public ProductController(ProductService productService, ProductMapper productMapper) {
        this.productService = productService;
        this.productMapper = productMapper;
    }


//    @GetMapping("/getAll")
//    public ResponseEntity<List<GetProduct>> getProducts() {
//        List
//        List<GetProduct> allProducts = productService.findAll();
//        return ResponseEntity.ok().body(allProducts);
//    }

}
