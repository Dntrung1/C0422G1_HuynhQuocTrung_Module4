package com.codegym.repository.impl;

import com.codegym.model.Language;
import com.codegym.repository.ILanguageRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LanguageRepository implements ILanguageRepository {
    private static final List<Language> languages = new ArrayList<>();

    static {
        languages.add(new Language("English"));
        languages.add(new Language("Vietnamese"));
        languages.add(new Language("Japanese"));
        languages.add(new Language("Chinese"));
    }

    @Override
    public List<Language> findAll() {
        return languages;
    }
}
