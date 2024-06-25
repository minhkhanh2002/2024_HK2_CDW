package com.nlu.fit.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nlu.fit.models.User;
import com.nlu.fit.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserRepository userRepository;
	@Override
	public User findByUserName(String userName) {
		// TODO Auto-generated method stub
		return userRepository.findByUserName(userName);
	}
	
	@Override
	public Boolean create(User user) {
		// TODO Auto-generated method stub
		try {
			this.userRepository.save(user);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public Boolean update(User user) {
		// TODO Auto-generated method stub
		
		return null;
	}
	@Override
	public Boolean delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


//	@Override
//	public void save(User user) {
//		// TODO Auto-generated method stub
//		LocalDateTime Date = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//        String creationDate = Date.format(formatter);
//        
//       
////        userReponsitory.save(user);
////        profileReponsitory.save(profile);
//		
//	}


	@Override
	public Boolean checkUserByUserName(String userName) {
		User user = userRepository.findByUserName(userName);
		if (user!=null) {
			return true;
		}
		return false;
	}
	

	
	@Override
	public Boolean checkLogin(String userName, String password) {
		// TODO Auto-generated method stub
		Optional<User> optionalUser = findById(userName);
		if (optionalUser.isPresent() && optionalUser.get().getPassWord().equals(password)) {
			return true;
		}
		return false;
	}

	@Override
	public Optional<User> findById(String id) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(userRepository.findByUserName(id));
	}

	
	
}