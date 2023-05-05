package com.masai.otms.service;

import java.util.List;

import com.masai.otms.exceptions.BookingException;
import com.masai.otms.models.Booking;

public interface BookingService {
		public Booking makeBooking(Booking bookings,Integer bookingId) throws BookingException;
		public Booking cancelBooking(Integer bookingId) throws BookingException;
		public List<Booking> viewBookings(Integer bookingId) throws BookingException;
		public List<Booking> viewAllBookings() throws BookingException;
	}
	
	
	

