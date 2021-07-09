package com.sapient.service;

import CartSystem.repository.CartRepository;
import com.sapient.model.Cart;
import com.sapient.model.Product;
import com.sapient.repository.ICartRepository;
import com.sapient.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartService {

    @Autowired
    private ICartRepository cartRepository;

    @Autowired
    private IProductRepository productRepository ;

    public void addProduct(Product product , Cart cart){
        Long cartId = cart.getCartId() ;
        Optional<Cart> cart1 = cartRepository.findById(cartId) ;
        cart1.
        cartRepository.save(cart1) ;
        cartRepository.save(cart) ;


    }

    public void updateCart(Cart newCart, Long cartId) {
        Cart cart = cartRepository.getById(cartId) ;
        

    }
}
