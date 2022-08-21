package com.codegym.repository.impl;
import com.codegym.model.Product;
import com.codegym.repository.DataBase;
import com.codegym.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Repository
public class ProductRepository implements IProductRepository {
    @Override
    public List<Product> showList(String name) {
        List<Product> products = new ArrayList<>();
            TypedQuery<Product> productTypedQuery =
                    DataBase.entityManager.createQuery("select p from Product p", Product.class);
            if (name.equals("")){
                return productTypedQuery.getResultList();
            }else {
                List<Product> productList = productTypedQuery.getResultList();

                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).getName().toLowerCase(Locale.ROOT).contains(name.toLowerCase(Locale.ROOT))){
                        products.add(productList.get(i));
                    }
                }
            }
        return products;

    }

    @Override
    public void addProduct(Product product) {
        EntityTransaction entityTransaction = DataBase.entityManager.getTransaction();
        entityTransaction.begin();
        DataBase.entityManager.persist(product);
        entityTransaction.commit();
    }

    @Override
    public void updateProduct(Product product) {
        EntityTransaction entityTransaction = DataBase.entityManager.getTransaction();
        entityTransaction.begin();
        DataBase.entityManager.merge(product);
        entityTransaction.commit();
    }

    @Override
    public Product findById(int id) {
        return DataBase.entityManager.find(Product.class, id);
    }

    @Override
    public void deleteProduct(int id) {
        Product product = findById(id);
        EntityTransaction entityTransaction = DataBase.entityManager.getTransaction();
        entityTransaction.begin();
        DataBase.entityManager.remove(product);
        entityTransaction.commit();
    }
}
