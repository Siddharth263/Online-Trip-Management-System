package com.masai.otms.repository;

import com.masai.otms.models.Admin;
import com.masai.otms.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
