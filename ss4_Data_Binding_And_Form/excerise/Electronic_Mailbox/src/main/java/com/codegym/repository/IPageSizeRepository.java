package com.codegym.repository;

import com.codegym.model.PageSize;

import java.util.List;

public interface IPageSizeRepository {
    List<PageSize> findAll();
}
