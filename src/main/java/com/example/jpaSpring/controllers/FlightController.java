package com.example.jpaSpring.controllers;

import com.example.jpaSpring.models.Flight;
import com.example.jpaSpring.services.FlightService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {
    private final FlightService flightService;
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }
    @GetMapping
    public List<Flight> getFlights() {
        return flightService.getFlights();
    }
}
