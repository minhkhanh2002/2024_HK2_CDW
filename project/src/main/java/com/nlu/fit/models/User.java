package com.nlu.fit.models;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "address")
	private String address;
	@Column(name = "birthday")
	private Date birthday;
	@Column(name = "email")
	private String email;
	@Column(name = "enabled")
	private boolean enabled;
	@Column(name = "fullname")
	private String fullname;
	@Column(name = "gender")
	private boolean gender;
	@Column(name = "password")
	private String password;
	@Column(name = "telephone")
	private String telephone;
	@Column(name = "username")
	private String username;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private Set<UserRole> userRoles;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(Long id, String address, Date birthday, String email, boolean enabled, String fullname, boolean gender,
			String password, String telephone, String username, Set<UserRole> userRoles) {
		super();
		this.id = id;
		this.address = address;
		this.birthday = birthday;
		this.email = email;
		this.enabled = enabled;
		this.fullname = fullname;
		this.gender = gender;
		this.password = password;
		this.telephone = telephone;
		this.username = username;
		this.userRoles = userRoles;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean isEnabled() {
		return enabled;
	}


	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public boolean isGender() {
		return gender;
	}


	public void setGender(boolean gender) {
		this.gender = gender;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public Set<UserRole> getUserRoles() {
		return userRoles;
	}


	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}


	
}