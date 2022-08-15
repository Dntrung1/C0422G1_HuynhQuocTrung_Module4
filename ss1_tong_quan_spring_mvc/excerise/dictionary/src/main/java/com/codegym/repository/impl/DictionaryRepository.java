package com.codegym.repository.impl;

import com.codegym.repository.IDictionaryRepository;
import org.springframework.stereotype.Repository;

import java.util.Locale;

@Repository
public class DictionaryRepository implements IDictionaryRepository {
    private String[] arr1 = {"cat","dog","pig"};
    private String[] arr2 = {"Mèo","Chó","Heo"};
    @Override
    public String dictionary(String word) {
        String results = "Không Tìm thấy";
        for (int i = 0; i < arr1.length; i++) {
            if (word.toLowerCase(Locale.ROOT).equals(arr1[i])){
                results = arr2[i];
            }
        }
        return results;
    }
}
