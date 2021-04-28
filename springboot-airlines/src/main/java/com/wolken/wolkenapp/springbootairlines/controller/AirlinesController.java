package com.wolken.wolkenapp.springbootairlines.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolken.wolkenapp.springbootairlines.entity.AirlinesEntity;
import com.wolken.wolkenapp.springbootairlines.service.AirlineService;

@RestController
@RequestMapping("/")


public class AirlinesController {
	
	
	@Autowired
	AirlineService service;
	@GetMapping("/index")
	public String index() {
		return "Hello World";
	}
	
	@PostMapping("/add")
	public String add(@RequestBody AirlinesEntity entity) {
		//System.out.println(entity);
		String message = service.validateAndSave(entity);
		return message;
	}
	
	@GetMapping("/get")
	public AirlinesEntity getByName(String airlinesName) {
		return service.validateAndGetByName(airlinesName);
	}
	
	@PutMapping("/update")
	public String updateByCountry(@RequestBody AirlinesEntity entity) {
		return service.validateAndUpdateByCountry(entity);
	}
	
	@DeleteMapping("/delete")
	public String deleteByName(String airlinesName) {
		return service.validateAndDeleteByName(airlinesName);
	}

}
