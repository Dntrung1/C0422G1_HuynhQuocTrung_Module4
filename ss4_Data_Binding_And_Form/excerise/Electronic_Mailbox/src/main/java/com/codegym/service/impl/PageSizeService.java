package com.codegym.service.impl;

import com.codegym.model.PageSize;
import com.codegym.repository.IPageSizeRepository;
import com.codegym.service.IPageSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageSizeService implements IPageSizeService {
    @Autowired
    private IPageSizeRepository iPageSizeRepositoryl;

    @Override
    public List<PageSize> findAll() {
        return iPageSizeRepositoryl.findAll();
    }
}
