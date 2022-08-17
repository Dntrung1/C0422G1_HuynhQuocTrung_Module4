package com.codegym.repository;

import com.codegym.model.Year;

import java.util.List;

public interface IYearRepository {
    List<Year> findAllYear();
}
