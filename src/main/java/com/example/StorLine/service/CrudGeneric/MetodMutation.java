package com.example.StorLine.service.CrudGeneric;

public interface MetodMutation<E ,T, ID> {
    E update(ID id,T t);
    void deleteById(ID id);
}
