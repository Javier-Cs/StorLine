package com.example.StorLine.tools;
import com.example.StorLine.dtos.GetProduct;
import com.example.StorLine.dtos.PostProduct;
import com.example.StorLine.dtos.PutProduct;
import com.example.StorLine.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper  extends GenericQueryMapper<Product, GetProduct> {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(source = "PostProduct", target = "Product")
    Product aProductEntity(PostProduct postProduct);
    PostProduct aDtoPost(Product product);

    @Mapping(source = "PutProduct", target = "Product")
    Product aProductEntity(PutProduct putProduct);
    PutProduct toDtoPut(Product product);


    // Mapea una sola entidad a un DTO
    @Override
    GetProduct toDto(Product entity);

    // Mapea la lista de entidades a una lista de DTOs (MapStruct lo resuelve)
    @Override
    List<GetProduct> toDtoList(List<Product> entities);
}
