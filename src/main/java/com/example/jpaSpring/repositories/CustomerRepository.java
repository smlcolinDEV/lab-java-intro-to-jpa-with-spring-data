package com.example.jpaSpring.repositories;

import com.example.jpaSpring.JPASpringApplication;
import com.example.jpaSpring.enums.CustomerStatus;
import com.example.jpaSpring.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByStatus(CustomerStatus status);


}
