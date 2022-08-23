package com.codegym.service.impl;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import com.codegym.repository.IBlogRepository;
import com.codegym.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public Page<Blog> findAll(Pageable pageable, String search, Category category) {
        Page<Blog> blogPage = null;
        if (category==null){
            blogPage =  iBlogRepository.findAllByDescriptionContaining(pageable,search);
        }else {
            blogPage =  iBlogRepository.findAllByDescriptionContainingAndCategory(pageable,search,category);
        }
        return blogPage;
    }

    @Override
    public Optional<Blog> findById(int id) {
        return iBlogRepository.findById(id);
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public void update(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public void delete(int id) {
        iBlogRepository.deleteById(id);
    }
}
