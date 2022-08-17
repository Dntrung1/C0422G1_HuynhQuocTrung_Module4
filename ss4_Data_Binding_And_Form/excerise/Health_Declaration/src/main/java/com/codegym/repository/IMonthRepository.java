package com.codegym.repository;

import com.codegym.model.Month;

import java.util.List;

public interface IMonthRepository {
    List<Month> findAllMonth();
}
