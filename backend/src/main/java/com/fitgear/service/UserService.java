package com.fitgear.service;

import java.util.List;

import com.fitgear.entities.User;
import com.fitgear.exception.UserException;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
