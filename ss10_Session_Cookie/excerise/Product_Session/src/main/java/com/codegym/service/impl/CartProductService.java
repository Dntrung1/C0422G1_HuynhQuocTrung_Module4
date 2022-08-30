package com.codegym.service.impl;
import com.codegym.model.CartProduct;
import com.codegym.service.ICartProductService;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CartProductService implements ICartProductService {

    @Override
    public Double total(List<CartProduct> productList) {
        double total = 0;
        for (int i = 0; i < productList.size() ; i++) {
            total += productList.get(i).getPrice() * productList.get(i).getCount();
        }
        return total;
    }
}
