package com.nlu.fit.services;

import com.nlu.fit.models.User;

public interface UserService {
	User findByUserName(String userName);
}
