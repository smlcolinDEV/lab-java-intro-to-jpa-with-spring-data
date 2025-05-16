package com.example.jpaSpring.demo;

import com.example.jpaSpring.enums.CustomerStatus;
import com.example.jpaSpring.models.Customer;
import com.example.jpaSpring.models.FlightBooking;
import com.example.jpaSpring.models.Flight;
import com.example.jpaSpring.repositories.CustomerRepository;
import com.example.jpaSpring.repositories.FlightBookingRepository;
import com.example.jpaSpring.repositories.FlightRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class DataLoader implements CommandLineRunner {
    private final CustomerRepository customerRepository;
    private final FlightRepository flightRepository;
    private final FlightBookingRepository flightBookingRepository;
    public DataLoader(CustomerRepository customerRepository, FlightRepository flightRepository, FlightBookingRepository flightBookingRepository) {
        this.customerRepository = customerRepository;
        this.flightRepository = flightRepository;
        this.flightBookingRepository = flightBookingRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading data...");
        var customer1 = new Customer("John", CustomerStatus.GOLD, 1000);
        var customer2 = new Customer("Walter", CustomerStatus.SILVER, 500);
        var customer3 = new Customer("Jane", CustomerStatus.NONE, 0);
        customerRepository.save(customer1);
        customerRepository.save(customer2);
        customerRepository.save(customer3);


        var flight1 = new Flight("123", "Boeing 747", 100, 10000);
        var flight2 = new Flight("456", "Airbus A320", 50, 5000);
        var flight3 = new Flight("789", "Boeing 777", 25, 2500);

        flightRepository.save(flight1);
        flightRepository.save(flight2);
        flightRepository.save(flight3);

        flightBookingRepository.save(new FlightBooking(1, 1));
        flightBookingRepository.save(new FlightBooking(2, 2));
        flightBookingRepository.save(new FlightBooking(3, 3));

    }
}
