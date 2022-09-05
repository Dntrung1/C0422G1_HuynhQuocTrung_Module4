package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import com.codegym.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(value = "/blogRests")
public class BlogRestController {

    @Autowired
    private IBlogService iBlogService;

    @GetMapping(value = {"", "/search"})
    public ResponseEntity<Page<Blog>> goBlogList( Pageable pageable,
                                                 @RequestParam(defaultValue = "",required = false) String search){
        Page<Blog> blogList = iBlogService.findAllBlogPage(pageable,search);

        if (!blogList.hasContent()){
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

//    @PostMapping("search")
//    public ResponseEntity<Page<Blog>> createStudent(@RequestParam String search) {
//        Page<Blog> blogList = iBlogService.findAll(search);
//
//        if (!blogList.hasContent()){
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//
//        return new ResponseEntity<>(blogList,HttpStatus.OK);
//    }
}
