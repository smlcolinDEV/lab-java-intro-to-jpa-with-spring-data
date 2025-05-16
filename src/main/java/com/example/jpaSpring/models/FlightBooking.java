package com.example.jpaSpring.models;

import jakarta.persistence.*;

@Entity
@Table(name = "flight_booking")
public class FlightBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name = "customer_id")
    private Integer customerId;
    @Column(name = "flight_id")
    private Integer flightId;

    public FlightBooking() {
    }
    public FlightBooking(Integer customerId, Integer flightId) {
        this.customerId = customerId;
        this.flightId = flightId;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    public Integer getFlightId() {
        return flightId;
    }
    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }
    @Override
    public String toString() {
        return "FlightBooking{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", flightId=" + flightId +
                '}';
    }
}
