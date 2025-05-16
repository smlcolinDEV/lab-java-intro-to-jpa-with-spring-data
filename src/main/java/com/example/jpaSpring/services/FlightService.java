package com.example.jpaSpring.services;

import com.example.jpaSpring.models.Flight;
import com.example.jpaSpring.repositories.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    private final FlightRepository flightRepository;
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }
    public List<Flight> getFlights() {
        return flightRepository.findAll();
    }
}
