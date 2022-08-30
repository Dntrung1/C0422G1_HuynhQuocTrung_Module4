package com.codegym.controller;

import com.codegym.model.CartProduct;
import com.codegym.model.Product;
import com.codegym.service.ICartProductService;
import com.codegym.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@SessionAttributes(value = "cartList")
@Controller
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @Autowired
    private ICartProductService iCartProductService;

    @ModelAttribute(value = "cartList")
    public List<CartProduct> createTalkList() {
        return new ArrayList<>();
    }

    @GetMapping("/cartList")
    public String goToCartList(Model model, @ModelAttribute(value ="cartList") List<CartProduct> cartList) {
        model.addAttribute("cartList", cartList);
        model.addAttribute("total", iCartProductService.total(cartList));
        return "cart";
    }

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("product", iProductService.findAll());
        return "list";
    }

    @GetMapping("/buy")
    public String goToCart(@RequestParam int id,
                           @ModelAttribute(value = "cartList") List<CartProduct> cartList,
                           RedirectAttributes redirectAttributes) {
        Product product = iProductService.findById(id);
        CartProduct cartProduct = new CartProduct();
        BeanUtils.copyProperties(product, cartProduct);
        boolean flag = true;
        for (int i = 0; i < cartList.size(); i++) {
            if (cartProduct.getId() == cartList.get(i).getId()) {
                cartList.get(i).setCount(cartList.get(i).getCount() + 1);
                flag = false;
                break;
            }
        }
        if (flag){
            cartList.add(cartProduct);
        }
        return "redirect:/";
    }
}
