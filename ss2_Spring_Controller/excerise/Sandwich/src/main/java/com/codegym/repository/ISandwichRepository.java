package com.codegym.repository;

import com.codegym.model.Sandwich;

import java.util.List;

public interface ISandwichRepository {
    List<Sandwich> findAll();
}
