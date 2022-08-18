package com.codegym.repository.impl;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Repository
public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Bánh", 20.0, "a", "Bánh"));
        productList.add(new Product(2, "Kẹo", 20.0, "a", "Kẹo"));
        productList.add(new Product(3, "Sữa", 20.0, "a", "Sữa"));

    }

    @Override
    public List<Product> showList() {
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        int id = productList.get(productList.size() - 1).getId() + 1;
        product.setId(id);
        productList.add(product);
    }

    @Override
    public void updateProduct(Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (product.getId() == productList.get(i).getId()) {
                productList.get(i).setName(product.getName());
                productList.get(i).setPrice(product.getPrice());
                productList.get(i).setNote(product.getNote());
                productList.get(i).setProducer(product.getProducer());
            }
        }
    }

    @Override
    public Product findById(int id) {
        Product product = new Product();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                product = productList.get(i);
            }
        }
        return product;
    }

    @Override
    public void deleteProduct(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.remove(productList.get(i));
            }
        }
    }

    @Override
    public Product findByName(String name) {
        Product product = new Product();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().toLowerCase(Locale.ROOT).contains(name.toLowerCase(Locale.ROOT))) {
                return product = productList.get(i);
            }
        }
        return null;
    }
}
