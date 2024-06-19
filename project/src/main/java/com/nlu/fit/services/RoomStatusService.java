package com.nlu.fit.services;

import java.util.List;

import com.nlu.fit.models.RoomStatus;

public interface RoomStatusService {
	List<RoomStatus> getAll();
	boolean create(RoomStatus roomStatus);
	RoomStatus findById(Integer id);
	boolean delete(Integer id);
	boolean update(RoomStatus roomStatus);
}
