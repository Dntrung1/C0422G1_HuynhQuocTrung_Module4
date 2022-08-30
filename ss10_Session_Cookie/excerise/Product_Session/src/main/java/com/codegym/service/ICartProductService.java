package com.codegym.service;

import com.codegym.model.CartProduct;

import java.util.List;

public interface ICartProductService {
    Double total(List<CartProduct> productList);
}
