package com.codegym.model;

import javax.persistence.*;
@Entity
@Table(name = "blog_info")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private String detail;
    private String author;

    @ManyToOne
    private Category category;

    public Blog(int id, String description, String detail, String author, Category category) {
        this.id = id;
        this.description = description;
        this.detail = detail;
        this.author = author;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Blog() {
    }

    public Blog(int id, String describe, String detail, String author) {
        this.id = id;
        this.description = describe;
        this.detail = detail;
        this.author = author;
    }

    public Blog(String describe, String detail, String author) {
        this.description = describe;
        this.detail = detail;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String describe) {
        this.description = describe;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
