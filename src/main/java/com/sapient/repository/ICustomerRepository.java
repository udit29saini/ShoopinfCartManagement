package com.sapient.repository;

import com.sapient.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer , Long> {
}
