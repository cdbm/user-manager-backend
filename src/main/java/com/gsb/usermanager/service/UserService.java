package com.gsb.usermanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsb.usermanager.model.User;
import com.gsb.usermanager.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	
	public void saveUser(User user) {
		this.repository.save(user);
	}
	
	public List<User> getUsers(){
		return this.repository.findAll();
	}
	
}
