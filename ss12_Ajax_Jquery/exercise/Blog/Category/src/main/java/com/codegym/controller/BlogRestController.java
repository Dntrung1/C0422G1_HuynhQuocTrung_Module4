package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "/blogRests")
public class BlogRestController {

    @Autowired
    private IBlogService iBlogService;

    @GetMapping("/")
    public ResponseEntity<List<Blog>> goBlogList(){
        List<Blog> blogList = iBlogService.findAllBlog();

        if (blogList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(blogList,HttpStatus.OK);
    }

    @GetMapping("/showListBlogByCategory")
    public ResponseEntity<List<Blog>> showListBlogToCategory(@RequestParam int id){
        List<Blog> blogs = iBlogService.findAllByCatelory(id);
        if (blogs.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<Blog> showListBlogById(@RequestParam int id){
        Blog blog = iBlogService.findById(id).orElse(null);
        if (blog == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(blog, HttpStatus.OK);
    }
}
