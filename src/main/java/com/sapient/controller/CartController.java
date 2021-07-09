package com.sapient.controller;


import com.sapient.model.Cart;
import com.sapient.model.Product;
import com.sapient.service.CartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CartController {

    @Autowired
    private CartService cartService ;

    @PostMapping("/cart")
    public ResponseEntity addProductToCart(@RequestBody Cart cart , Product product){
           cartService.addProduct(product , cart) ;
           return new ResponseEntity("Product has been added to Cart having cart_id:- " + cart.getCartId() , HttpStatus.CREATED) ;
    }

    @PostMapping("/updatecart{cartid}")
    public ResponseEntity updateCart(@RequestBody Cart newCart , @PathVariable Long cartId){
        cartService.updateCart(newCart , cartId);
        return new ResponseEntity("Cart has been updated" , HttpStatus.OK) ;
    }

}
