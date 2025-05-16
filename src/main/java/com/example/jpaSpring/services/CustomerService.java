package com.example.jpaSpring.services;

import com.example.jpaSpring.enums.CustomerStatus;
import com.example.jpaSpring.models.Customer;
import com.example.jpaSpring.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
    public List<Customer> getCustomersById(CustomerStatus customerStatus){
        return customerRepository.findByStatus(customerStatus);

    }
}
