package com.nlu.fit.services;

import java.util.List;

import com.nlu.fit.models.Room;



public interface RoomService {
	List<Room> getAll();
	boolean create(Room room);
	Room findById(Integer id);
	boolean delete(Integer id);
	boolean update(Room room);
}
