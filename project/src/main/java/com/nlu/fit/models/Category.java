package com.nlu.fit.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name =  "categoryName")
	private String categoryName;
	@Column(name = "categoryStatus")
	private Boolean categoryStatus;
	@OneToMany(mappedBy = "category")
	private Set<Room> rooms;
	public Category() {
		// TODO Auto-generated constructor stub
	}

	

	public Category(Integer id, String categoryName, Boolean categoryStatus, Set<Room> rooms) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.categoryStatus = categoryStatus;
		this.rooms = rooms;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer categoryId) {
		this.id = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Boolean getCategoryStatus() {
		return categoryStatus;
	}

	public void setCategoryStatus(Boolean categoryStatus) {
		this.categoryStatus = categoryStatus;
	}
	
	
	public Set<Room> getRooms() {
		return rooms;
	}
	
	public void setRooms(Set<Room> rooms) {
		this.rooms = rooms;
	}
	
}
