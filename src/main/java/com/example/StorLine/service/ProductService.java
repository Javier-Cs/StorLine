package com.example.StorLine.service;

import com.example.StorLine.entity.Product;
import com.example.StorLine.exception.ResourceNotFoundException;
import com.example.StorLine.repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements CrudGenerico<Product, Integer> {

    private final ProductRepo productoRepo;

    public ProductService(ProductRepo productoRepo) {
        this.productoRepo = productoRepo;
    }


    @Override
    public List<Product> findAll() {
        return productoRepo.findAll() ;
    }

    @Override
    public Product findById(Integer id) {
        return productoRepo.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Book with id " + id + " not found")
        );
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Product update(Integer id, Product product) {
        return null;
    }
}
