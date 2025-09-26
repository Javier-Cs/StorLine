package com.example.StorLine.service;

import com.example.StorLine.dtos.GetProduct;
import com.example.StorLine.dtos.PostProduct;
import com.example.StorLine.dtos.PutProduct;
import com.example.StorLine.entity.Product;
import com.example.StorLine.exception.ResourceNotFoundException;
import com.example.StorLine.repository.ProductRepo;
import com.example.StorLine.service.CrudGeneric.MetodMutation;
import com.example.StorLine.service.CrudGeneric.MetodQuery;
import com.example.StorLine.service.CrudGeneric.MetodSave;
import com.example.StorLine.tools.GenerarCode;
import com.example.StorLine.tools.ProductMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {

    private final ProductRepo productoRepo;
    private final ProductMapper productMapper;


    public ProductService(ProductRepo productoRepo, ProductMapper productMapper) {
        this.productoRepo = productoRepo;
        this.productMapper = productMapper;
    }




    public List<Product> findAll() {
        return productoRepo.findAll();
    }

    public Product findById(Integer id) {
        return productoRepo.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Product not found with id " + id)
        );
    }


    public Product save(Product postProduct) {
        postProduct.setCode(GenerarCode.generarCode());
        return productoRepo.save(postProduct);
    }

    public Product update(Integer id, Product putProduct) {
        Product productToUp = productoRepo.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Product not found with id " + id)
        );
        return productoRepo.save(productToUp);
    }

    public void deleteById(Integer id) {
        productoRepo.deleteById(id);

    }

}
