package com.codegym.repository;

import com.codegym.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
}
