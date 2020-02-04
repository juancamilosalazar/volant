package com.example.volant.volant.service;

import java.util.List;

public interface ServiceBase<T> {
    List<T> findAll();
    T findByCodigo(String codigo);
    T save(T entinty);
    void delete(T entity);
}
