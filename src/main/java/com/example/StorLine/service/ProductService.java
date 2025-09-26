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
public class ProductService implements  MetodQuery<GetProduct, Integer>, MetodSave<PostProduct, PostProduct>, MetodMutation<Product,PutProduct, Integer> {

    private final ProductRepo productoRepo;
    private final ProductMapper productMapper;


    public ProductService(ProductRepo productoRepo, ProductMapper productMapper) {
        this.productoRepo = productoRepo;
        this.productMapper = productMapper;
    }

    @Override
    public List<GetProduct> findAll() {
        List<Product> allProducts = productoRepo.findAll();
        return productMapper.toDtoList(allProducts);
    }

    @Override
    public GetProduct findById(Integer id) {
        Product product = productoRepo.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Product not found with id " + id)
        );
        return productMapper.toDto(product);
    }


    @Override
    public PostProduct save(PostProduct postProduct) {
        Product pro = productMapper.aProductEntity(postProduct);
        pro.setCode(GenerarCode.generarCode());
        Product product = productoRepo.save(pro);
        return productMapper.aDtoPost(product);
    }


    @Override
    public Product update(Integer id, PutProduct putProduct) {
        Product productToUp = productoRepo.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Product not found with id " + id)
        );
        productMapper.updateProductFromDto(putProduct, productToUp);
        return productoRepo.save(productToUp);
    }

    @Override
    public void deleteById(Integer id) {
        productoRepo.deleteById(id);

    }

}
