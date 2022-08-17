package com.codegym.repository;

import com.codegym.model.Nationality;

import java.util.List;

public interface INationalityRepository {
    List<Nationality> findAllNation();
}
