package com.nlu.fit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nlu.fit.models.Room;
import com.nlu.fit.repository.RoomRepository;

@Service
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	private RoomRepository roomRepository;
	
	@Override
	public List<Room> getAll() {
		// TODO Auto-generated method stub
		return this.roomRepository.findAll();
	}

	@Override
	public boolean create(Room room) {
		try {
			this.roomRepository.save(room);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Room findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Room room) {
		// TODO Auto-generated method stub
		return false;
	}

}
