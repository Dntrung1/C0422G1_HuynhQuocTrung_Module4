package com.codegym.service;

import com.codegym.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    Page<Product> showList(Pageable pageable,String search);

    void addProduct(Product product);

    void updateProduct(Product product);

    Product findById(int id);

    void deleteProduct(int id);

}
