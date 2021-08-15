package com.example.springplaygroundnew.services;

import com.example.springplaygroundnew.entity.BaseEntity;

import java.util.List;

public interface BaseService<T extends BaseEntity> {
    T save(T entity);
    T findById(Long id);
    List<T> findAll();
}
