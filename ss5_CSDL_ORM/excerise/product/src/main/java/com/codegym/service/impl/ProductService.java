package com.codegym.service.impl;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepository;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public List<Product> showList() {
        return (List<Product>) iProductRepository.findAll();

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
    public Optional<Product> findById(int id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void deleteProduct(int id) {
        iProductRepository.deleteById(id);
    }

}
