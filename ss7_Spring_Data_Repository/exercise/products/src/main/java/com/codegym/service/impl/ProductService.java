package com.codegym.service.impl;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepository;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public Page<Product> showList(Pageable pageable,String search) {
        return iProductRepository.findAllByNameContaining(pageable,search);

    }

    @Override
    public void addProduct(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public void updateProduct(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        return iProductRepository.findById(id).orElse(new Product());
    }

    @Override
    public void deleteProduct(int id) {
        iProductRepository.deleteById(id);
    }

}
