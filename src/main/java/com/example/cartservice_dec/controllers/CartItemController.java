package com.example.cartservice_dec.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cartservice_dec.models.CartItem;
import com.example.cartservice_dec.reporistories.CartRepository;
@RestController
@RequestMapping("/cart")
public class CartItemController {
    @Autowired
    private CartRepository cartRepository;

    @PostMapping("/add")
    public CartItem addCartItem(@RequestBody CartItem cartItem){
        return cartRepository.save(cartItem);
    }
}
