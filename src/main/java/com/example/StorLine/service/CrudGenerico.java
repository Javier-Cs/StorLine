package com.example.StorLine.service;


import java.util.List;

public interface CrudGenerico<T, ID> {
    List<T> findAll();
    T findById(ID id);
    T save(T t);
    void deleteById(ID id);
    T update(ID id,T t);

}
