package com.masai.otms.service;

import com.masai.otms.models.Users;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    public Users addUser(Users user);

}
