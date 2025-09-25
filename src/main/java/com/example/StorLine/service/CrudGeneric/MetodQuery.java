package com.example.StorLine.service.CrudGeneric;


import java.util.List;

public interface MetodQuery<T, ID> {
    List<T> findAll();
    T findById(ID id);

}
