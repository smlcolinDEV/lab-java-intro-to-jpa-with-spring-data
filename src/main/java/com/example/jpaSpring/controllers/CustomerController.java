package com.example.jpaSpring.controllers;

import com.example.jpaSpring.enums.CustomerStatus;
import com.example.jpaSpring.models.Customer;
import com.example.jpaSpring.services.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customers")

public class CustomerController {
    private final CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getCustomers();

    }
    @GetMapping("/{status}")
    public List<Customer> findByStatus(@PathVariable CustomerStatus status){
        return customerService.getCustomersById(status);
    }

}
