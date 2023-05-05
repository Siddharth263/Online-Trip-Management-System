package com.masai.otms.repository;

import com.masai.otms.models.Admin;
import com.masai.otms.models.Travels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelsRepo extends JpaRepository<Travels, Integer> {
}
