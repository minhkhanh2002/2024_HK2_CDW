package com.nlu.fit.models;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "username")
	private String userName;
	@Column(name = "password")
	private String passWord;
	@Column(name = "enabled")
	private Boolean enabled;
	@Column(name = "fullname")
	private String fullName;
	@Column(name = "gender")
	private Boolean gender;
	@Column(name = "birthday")
	private Date birthday;
	@Column(name = "address")
	private String address;
	@Column(name = "email")
	private String email;
	@Column(name = "cccd")
	private String cccd;
	@Column(name = "telephone")
	private String telephone;
	@Column(name = "creation_date")
	private String creationDate;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private Set<UserRole> userRoles;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(Long id, String userName, String passWord, Boolean enabled, String fullName, Boolean gender,
			Date birthday, String address, String email, String cccd, String telephone, String creationDate,
			Set<UserRole> userRoles) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.enabled = enabled;
		this.fullName = fullName;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.email = email;
		this.cccd = cccd;
		this.telephone = telephone;
		this.creationDate = creationDate;
		this.userRoles = userRoles;
	}
	


	public User(String userName, String passWord, Boolean enabled, String fullName, Boolean gender, Date birthday,
			String address, String email, String cccd, String telephone, String creationDate, Set<UserRole> userRoles) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.enabled = enabled;
		this.fullName = fullName;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.email = email;
		this.cccd = cccd;
		this.telephone = telephone;
		this.creationDate = creationDate;
		this.userRoles = userRoles;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


	public Boolean getEnabled() {
		return enabled;
	}


	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public Boolean getGender() {
		return gender;
	}


	public void setGender(Boolean gender) {
		this.gender = gender;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCccd() {
		return cccd;
	}


	public void setCccd(String cccd) {
		this.cccd = cccd;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}


	public Set<UserRole> getUserRoles() {
		return userRoles;
	}


	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}


	

	}