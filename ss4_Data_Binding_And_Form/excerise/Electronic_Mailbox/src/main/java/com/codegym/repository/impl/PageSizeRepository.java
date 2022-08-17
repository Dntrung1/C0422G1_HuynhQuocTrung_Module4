package com.codegym.repository.impl;

import com.codegym.model.PageSize;
import com.codegym.repository.IPageSizeRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PageSizeRepository implements IPageSizeRepository {
    private static List<PageSize> pageSizes = new ArrayList<>();

    static {
        pageSizes.add(new PageSize(5));
        pageSizes.add(new PageSize(10));
        pageSizes.add(new PageSize(15));
        pageSizes.add(new PageSize(25));
        pageSizes.add(new PageSize(50));
        pageSizes.add(new PageSize(100));
    }

    @Override
    public List<PageSize> findAll() {
        return pageSizes;
    }
}
