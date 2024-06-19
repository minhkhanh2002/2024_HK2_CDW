package com.nlu.fit.models;


import java.text.NumberFormat;
import java.util.Locale;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "rooms")
public class Room {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "roomName")
	private String roomName;
	@Column(name = "place")
	private String place;
	@Column(name = "price")
	private Double price;
	@Column(name = "image")
	private String image;
	@Column(name = "address")
	private String address;
	
	@Column(name = "description", columnDefinition = "TEXT")
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "statusId",referencedColumnName = "id")
	private RoomStatus roomStatus;
	@ManyToOne
	@JoinColumn(name = "categoryId",referencedColumnName = "id")
	private Category category;
	
	public Room() {
		// TODO Auto-generated constructor stub
	}

	
	
	 public Room(Integer id, String roomName, String place, Double price, String image, String address,
			String description, RoomStatus roomStatus, Category category) {
		super();
		this.id = id;
		this.roomName = roomName;
		this.place = place;
		this.price = price;
		this.image = image;
		this.address = address;
		this.description = description;
		this.roomStatus = roomStatus;
		this.category = category;
	}



	public String getFormattedPrice() {
	        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
	        return currencyFormatter.format(price);
	    }



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getRoomName() {
		return roomName;
	}



	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}



	public String getPlace() {
		return place;
	}



	public void setPlace(String place) {
		this.place = place;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public RoomStatus getRoomStatus() {
		return roomStatus;
	}



	public void setRoomStatus(RoomStatus roomStatus) {
		this.roomStatus = roomStatus;
	}



	public Category getCategory() {
		return category;
	}



	public void setCategory(Category category) {
		this.category = category;
	}

	
	
}
