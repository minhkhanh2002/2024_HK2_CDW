package com.nlu.fit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nlu.fit.models.RoomStatus;
import com.nlu.fit.repository.RoomStatusRespository;

@Service
public class RoomStatusServiceImpl implements RoomStatusService {
	@Autowired
	private RoomStatusRespository roomStatusRespository;
	
	@Override
	public List<RoomStatus> getAll() {
		// TODO Auto-generated method stub
		return this.roomStatusRespository.findAll();
	}

	@Override
	public boolean create(RoomStatus roomStatus) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public RoomStatus findById(Integer id) {
		
		return this.roomStatusRespository.findById(id).get();
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(RoomStatus roomStatus) {
		// TODO Auto-generated method stub
		return false;
	}

}
