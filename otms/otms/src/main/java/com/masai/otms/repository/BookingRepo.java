package com.masai.otms.repository;

import com.masai.otms.models.Admin;
import com.masai.otms.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<Booking, Integer> {
}
