package com.codegym.practice_add_product.service;

import com.codegym.practice_add_product.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();

    Optional<Product> findById(Long id);
}