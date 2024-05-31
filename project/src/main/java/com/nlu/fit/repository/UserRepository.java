package com.nlu.fit.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nlu.fit.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUserName(String userName);
}
