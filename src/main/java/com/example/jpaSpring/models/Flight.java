package com.example.jpaSpring.models;

import jakarta.persistence.*;

@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "flight_number")
    private String flightNumber;
    @Column(name = "aircraft")
    private String aircraft;
    @Column(name = "total_number_of_seats")
    private Integer totalNumberOfSeats;
    @Column(name = "mileage")
    private Integer mileage;

    public Flight() {
    }
    public Flight(String flightNumber, String aircraft, Integer totalNumberOfSeats, Integer mileage) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.totalNumberOfSeats = totalNumberOfSeats;
        this.mileage = mileage;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    public String getAircraft() {
        return aircraft;
    }
    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }
    public Integer getTotalNumberOfSeats() {
        return totalNumberOfSeats;
    }
    public void setTotalNumberOfSeats(Integer totalNumberOfSeats) {
        this.totalNumberOfSeats = totalNumberOfSeats;
    }
    public Integer getMileage() {
        return mileage;
    }
    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }
    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", flightNumber='" + flightNumber + '\'' +
                ", aircraft='" + aircraft + '\'' +
                ", totalNumberOfSeats=" + totalNumberOfSeats +
                ", mileage=" + mileage +
                '}';
    }
}
