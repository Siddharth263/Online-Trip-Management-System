package com.masai.otms.repository;

import com.masai.otms.models.Admin;
import com.masai.otms.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepo extends JpaRepository<Hotel, Integer> {
}
