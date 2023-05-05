package com.masai.otms.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.otms.exceptions.UserException;
import com.masai.otms.models.User;

public interface UserService {
	
	public User addUser(User user) throws UserException;
}
