package com.nlu.fit.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nlu.fit.models.User;

import dto.UserDto;

@Service
public interface UserService {
	User findByUserName(String userName);
	Boolean create(User user);
	Boolean update(User user);
	Boolean delete(Long id);
		
	
	Optional<User> findById(String id);
	Boolean checkLogin(String userName, String password);
	Boolean checkUserByUserName(String userName);

}
