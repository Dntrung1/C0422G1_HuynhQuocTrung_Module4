package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> showList();

    void addProduct(Product product);

    void updateProduct(Product product);

    Product findById(int id);

    void deleteProduct(int id);

    Product findByName(String name);
}
