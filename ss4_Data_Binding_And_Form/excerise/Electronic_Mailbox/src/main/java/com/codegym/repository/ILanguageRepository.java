package com.codegym.repository;

import com.codegym.model.Language;

import java.util.List;

public interface ILanguageRepository {
    List<Language> findAll();
}
