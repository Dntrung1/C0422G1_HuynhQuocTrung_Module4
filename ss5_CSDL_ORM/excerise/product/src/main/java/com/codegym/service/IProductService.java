package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> showList();

    void addProduct(Product product);

    void updateProduct(Product product);

    Optional<Product> findById(int id);

    void deleteProduct(int id);

}
