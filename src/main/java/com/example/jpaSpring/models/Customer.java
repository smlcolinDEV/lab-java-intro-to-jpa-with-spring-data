package com.example.jpaSpring.models;

import com.example.jpaSpring.enums.CustomerStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private CustomerStatus status;
    @Column(name = "total_miles")
    private Integer totalMiles;

    public Customer() {
    }
    public Customer(String name, CustomerStatus status, Integer totalMiles) {
        this.name = name;
        this.status = status;
        this.totalMiles = totalMiles;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public CustomerStatus getStatus() {
        return status;
    }
    public void setStatus(CustomerStatus status) {
        this.status = status;
    }
    public Integer getTotalMiles() {
        return totalMiles;
    }
    public void setTotalMiles(Integer totalMiles) {
        this.totalMiles = totalMiles;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", totalMiles=" + totalMiles +
                '}';
    }
}
