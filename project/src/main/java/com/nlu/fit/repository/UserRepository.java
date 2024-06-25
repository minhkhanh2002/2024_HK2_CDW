package com.nlu.fit.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.nlu.fit.models.User;
@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUserName(String userName);
	User getUserByUserName(String userName);
	
}
