package com.example.StorLine.service.CrudGeneric;

public interface MetodMutation<T, ID> {
    T update(ID id,T t);
    void deleteById(ID id);
}
