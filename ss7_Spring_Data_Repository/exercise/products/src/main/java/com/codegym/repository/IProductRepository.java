package com.codegym.repository;

import com.codegym.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepository extends JpaRepository<Product, Integer> {
    Page<Product> findAllByNameContaining(Pageable pageable, String search);
}
