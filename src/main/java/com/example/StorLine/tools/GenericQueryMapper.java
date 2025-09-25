package com.example.StorLine.tools;

import java.util.List;

public interface GenericQueryMapper <E, D>{

    D toDto(E entity);

    List<D> toDtoList(List<E> entityList);
}
