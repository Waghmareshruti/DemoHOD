package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.HODRequestDTO;
import com.example.demo.model.HOD;
import com.example.demo.service.HODService;

public class HODController {
	@Autowired
	private HODService hs;
	
	@PostMapping("add")
	public void addHod(HODRequestDTO dto) {
		hs.add(dto);
		
	}

}
