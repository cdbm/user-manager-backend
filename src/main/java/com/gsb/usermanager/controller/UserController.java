package com.gsb.usermanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gsb.usermanager.model.User;
import com.gsb.usermanager.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/saveUser")
	public ResponseEntity saveUser(@RequestBody User user) {
		this.service.saveUser(user);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/getUsers")
	public ResponseEntity getUsers() {
		return ResponseEntity.ok(this.service.getUsers());
	}
}
