package com.codegym.repository;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    Page<Blog> findByDescriptionContaining(Pageable pageable, String search);
    Page<Blog> findAllByDescriptionContainingAndCategory(Pageable pageable, String search, Category category);
    List<Blog> findAllByCategory(Category category);
}
