package com.sapient.controller;


import com.sapient.model.Cart;
import com.sapient.model.Product;
import com.sapient.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<Product> showAllProducts(){
        log.info("Showing all products") ;
        List<Product> products = productService.showAllUser() ;
        return new ResponseEntity(products , HttpStatus.OK) ;
    }

    @PostMapping("/products")
    public ResponseEntity addProduct(@RequestBody Product product){
        log.info("Adding product" + product) ;
        Product product1 = productService.addProduct(product) ;
        return new ResponseEntity(product1 , HttpStatus.CREATED) ;
    }

    @PostMapping("/products/{customerid}")
    public ResponseEntity addProduct(@RequestBody Product product , @PathVariable Long customerid){
        productService.addProductToParticularCustomer(product , customerid) ;
        return new ResponseEntity("Product has been added to customerid:- " + customerid, HttpStatus.CREATED ) ;
    }

//    @GetMapping("/products/{productType}")
//    public ResponseEntity<Product> getAllProductsOfParticularType(@RequestBody Product product , @PathVariable String productType){
//        List<Product> products = productService.getParticularTypeOfProduct(product , productType) ;
//        return new ResponseEntity<>(product , HttpStatus.OK) ;
//    }

//    @PostMapping("/products/{cartId}")
//    public ResponseEntity<Product> addProductInParticularCart(@RequestBody Product product , @PathVariable Long cartId){
//        Cart cart = cartService.addThisProductToCartId(Product product , Long cartId) ;
//        return new ResponseEntity<>(cart , HttpStatus.CREATED) ;
//    }
    
}
