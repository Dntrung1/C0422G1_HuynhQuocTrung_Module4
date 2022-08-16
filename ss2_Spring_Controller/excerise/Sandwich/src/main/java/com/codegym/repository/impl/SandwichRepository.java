package com.codegym.repository.impl;

import com.codegym.model.Sandwich;
import com.codegym.repository.ISandwichRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SandwichRepository implements ISandwichRepository {
    private static List<Sandwich> sandwiches = new ArrayList<>();

    static {
        sandwiches.add(new Sandwich(1, "Lettuce"));
        sandwiches.add(new Sandwich(2, "Tomato"));
        sandwiches.add(new Sandwich(3, "Mustard"));
        sandwiches.add(new Sandwich(4, "Sprouts"));
    }

    @Override
    public List<Sandwich> findAll() {
        return sandwiches;
    }
}
