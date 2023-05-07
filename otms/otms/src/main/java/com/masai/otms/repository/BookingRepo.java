package com.masai.otms.repository;

import com.masai.otms.exceptions.BookingException; 
import com.masai.otms.models.Admin;
import com.masai.otms.models.Booking;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer> {
//	@Query("select e from booking e where e.bookingId=?1")
//	public List<Booking> viewBookingById(Integer bookingId) throws BookingException;
	
	
}
