package com.nlu.fit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.nlu.fit.models.User;

@SpringBootApplication
public class SessionCrudApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Bean(name = "USER_BEAN")
	public User setUser() {
		User u = new User();
		u.setUserName("admin123");
		u.setPassWord("admin123");
		return u;
	}
}
