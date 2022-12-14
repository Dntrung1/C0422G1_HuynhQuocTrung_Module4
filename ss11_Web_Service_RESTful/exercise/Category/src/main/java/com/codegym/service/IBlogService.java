package com.codegym.service;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable, String search, Category category);

    List<Blog> findAllBlog();

    Optional<Blog> findById(int id);

    void save(Blog blog);

    void update(Blog blog);

    void delete(int id);

    List<Blog> findAllByCatelory(int id);

    Page<Blog> findAllBlogPage(Pageable pageable, String search);
}
