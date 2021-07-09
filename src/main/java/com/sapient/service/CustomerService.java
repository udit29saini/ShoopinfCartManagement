package com.sapient.service;


import com.sapient.model.Customer;
import com.sapient.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private ICustomerRepository customerRepository ;

    public List<Customer> fetchAllCustomers() {
        return (List<Customer>) customerRepository.findAll() ;
     }

    public Customer addCustomer(Customer customer) {
        Customer save = customerRepository.save(customer) ;
        return save ;
    }

    public Customer getCustomerUsingCustomerId(Long customerid) {
        Customer customer = customerRepository.getById(customerid) ;
        return customer ;
    }
}
