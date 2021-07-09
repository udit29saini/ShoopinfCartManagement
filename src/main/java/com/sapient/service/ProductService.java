package com.sapient.service;

import com.sapient.model.Customer;

import com.sapient.model.Product;
import com.sapient.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private IProductRepository productRepository;

    private CustomerService customerService ;


    public List<Product> showAllUser() {
        return productRepository.findAll() ;
    }

    public Product addProduct(Product product) {
        productRepository.save(product) ;
        return product;
    }

    public void addProductToParticularCustomer(Product product, Long customerid) {
        Customer customer = customerService.getCustomerUsingCustomerId(customerid) ;
    }

//    public List<Product> getParticularTypeOfProduct(Product product, String productype) {
//
//    }

}
