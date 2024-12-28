package com.example.cartservice_dec.reporistories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.cartservice_dec.models.CartItem;

public interface CartRepository extends MongoRepository<CartItem, Integer>{
} 
