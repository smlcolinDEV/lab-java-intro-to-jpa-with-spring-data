package com.example.jpaSpring.controllers;

import com.example.jpaSpring.models.FlightBooking;
import com.example.jpaSpring.services.FlightBookingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/flight-bookings")

public class FlightBookingController {
    private final FlightBookingService flightBookingService;
    public FlightBookingController(FlightBookingService flightBookingService) {
        this.flightBookingService = flightBookingService;
    }

    @GetMapping
    public List<FlightBooking> getFlightBookings() {
        return flightBookingService.getFlightBookings();
    }
}
