package com.masai.otms.service.Implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.masai.otms.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;

import com.masai.otms.exceptions.BookingException;
import com.masai.otms.models.Booking;
import com.masai.otms.models.User;
import com.masai.otms.repository.BookingRepo;
import com.masai.otms.repository.PackageRepo;
import com.masai.otms.repository.UserRepo;


public class BookingServiceImpl implements BookingService {

	@Autowired
	PackageRepo pkgRepo;
	
	@Autowired
	BookingRepo bookRepo;
	
	@Autowired
	UserRepo userRepo;
	
	
	
	
	@Override
	public Booking makeBooking(Booking bookings, Integer bookingId) throws BookingException {
		
//		List<Package> pkg = new ArrayList<>();
//		pkg = bookings.getApackage();
//		
//		
//		
		
		return bookings;
		
     
		
		
	}

	
	
	
	
	
	
	
	
	
	@Override
	public Booking cancelBooking(Integer bookingId) throws BookingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> viewBookings(Integer bookingId) throws BookingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> viewAllBookings() throws BookingException {
		// TODO Auto-generated method stub
		return null;
	}

}
