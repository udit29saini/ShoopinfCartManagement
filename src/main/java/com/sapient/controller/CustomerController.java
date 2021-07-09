package com.sapient.controller;


import com.sapient.model.Customer;
import com.sapient.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService ;

    @GetMapping("/hello")
    public void sayHello(){
        System.out.println("Hello");
    }

    @GetMapping("/customers")
    public ResponseEntity fetchAllCustomers(){
        List<Customer> customerList = customerService.fetchAllCustomers() ;
        return new ResponseEntity(customerList , HttpStatus.OK) ;
    }

    @PostMapping("/customres")
    public ResponseEntity addCustomer(@RequestBody Customer customer){
        Customer savedCustomer = customerService.addCustomer(customer) ;
        return new ResponseEntity(savedCustomer , HttpStatus.OK) ;
    }


}
