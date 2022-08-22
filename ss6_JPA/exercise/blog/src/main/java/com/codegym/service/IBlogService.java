package com.codegym.service;

import com.codegym.model.Blog;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    Iterable<Blog> findAll();

    Optional<Blog> findById(int id);

    void save(Blog blog);

    void update(Blog blog);

    void delete(int id);
}
