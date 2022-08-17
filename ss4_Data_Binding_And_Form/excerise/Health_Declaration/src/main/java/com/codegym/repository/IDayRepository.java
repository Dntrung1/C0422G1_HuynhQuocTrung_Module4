package com.codegym.repository;

import com.codegym.model.Day;

import java.util.List;

public interface IDayRepository {
    List<Day> findAllDay();
}
