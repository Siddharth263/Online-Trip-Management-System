package com.masai.otms.repository;

import com.masai.otms.models.Admin;
import com.masai.otms.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
