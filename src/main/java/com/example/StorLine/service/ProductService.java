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
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements  MetodQuery<GetProduct, Integer>,MetodSave<PostProduct>, MetodMutation<PutProduct, Integer> {

    private final ProductRepo productoRepo;

    public ProductService(ProductRepo productoRepo) {
        this.productoRepo = productoRepo;
    }

    @Override
    public List<GetProduct> findAll() {
        return productoRepo.findAll();
    }

    @Override
    public GetProduct findById(Integer integer) {
        return null;
    }

    @Override
    public PostProduct save(PostProduct postProduct) {
        return null;
    }

    @Override
    public PutProduct update(Integer integer, PutProduct putProduct) {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }


}
