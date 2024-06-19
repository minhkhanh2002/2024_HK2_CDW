package com.nlu.fit.controllers.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.nlu.fit.models.Category;
import com.nlu.fit.models.Room;
import com.nlu.fit.models.RoomStatus;
import com.nlu.fit.services.CategoryService;
import com.nlu.fit.services.RoomService;
import com.nlu.fit.services.RoomStatusService;
import com.nlu.fit.services.StorageService;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/admin")
public class RoomController {

	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private RoomStatusService roomStatusService;

	@Autowired
	private StorageService storageService;

	@Autowired
	private RoomService roomService;

	@RequestMapping("/room")
	public String index(Model model ) {
		List<Room> listRoom = this.roomService.getAll();
		model.addAttribute("listRoom",listRoom);
		return "admin/room/index";
	}

	@RequestMapping("/room-add")
	public String add(Model model) {
		Room room = new Room();
		model.addAttribute("room", room);

		List<Category> listCate = this.categoryService.getAll();
		model.addAttribute("listCate", listCate);
		
		List<RoomStatus> listStatus = this.roomStatusService.getAll();
		model.addAttribute("listStatus", listStatus);

		return "admin/room/add";
	}

	@PostMapping("/room-add")
	public String save(@ModelAttribute("room") Room room, @RequestParam("fileImage") MultipartFile file) {

		// upload file
		this.storageService.store(file);
		String fileName = file.getOriginalFilename();
		room.setImage(fileName);
		if (this.roomService.create(room)) {
			return "redirect:/admin/room";
		}

		return "admin/room/add";
	}
}