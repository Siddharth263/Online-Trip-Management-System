package com.masai.otms.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.otms.exceptions.UserException;
import com.masai.otms.models.User;
import com.masai.otms.repository.UserRepo;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;

	@Override
	public User addUser(User user) throws UserException{
		if(user.getUserId() !=null) throw new UserException("Not Found");
		User u=userRepo.save(user);
		
		return u;
	}
	
     
}
