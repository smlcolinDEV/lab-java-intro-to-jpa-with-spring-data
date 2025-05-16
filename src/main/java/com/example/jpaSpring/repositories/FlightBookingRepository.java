package com.example.jpaSpring.repositories;

import com.example.jpaSpring.models.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightBookingRepository extends JpaRepository<FlightBooking, Long> {

    List<FlightBooking> findByCustomerId(Integer customerId);

}
