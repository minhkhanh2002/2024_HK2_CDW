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
@Table(name = "room_status")
public class RoomStatus {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name =  "statusName")
	private String statusName;
	@OneToMany(mappedBy = "roomStatus")
	private Set<Room> rooms;
	public RoomStatus() {
		// TODO Auto-generated constructor stub
	}
	public RoomStatus(Integer id, String statusName, Set<Room> rooms) {
		super();
		this.id = id;
		this.statusName = statusName;
		this.rooms = rooms;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public Set<Room> getRooms() {
		return rooms;
	}
	public void setRooms(Set<Room> rooms) {
		this.rooms = rooms;
	}
	
}