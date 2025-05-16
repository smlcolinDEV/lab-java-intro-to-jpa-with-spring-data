package com.example.jpaSpring.services;

import com.example.jpaSpring.models.FlightBooking;
import com.example.jpaSpring.repositories.FlightBookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightBookingService {
    private final FlightBookingRepository flightBookingRepository;
    public FlightBookingService(FlightBookingRepository flightBookingRepository) {
        this.flightBookingRepository = flightBookingRepository;
    }
    public List<FlightBooking> getFlightBookings() {
        return flightBookingRepository.findAll();
    }
}
