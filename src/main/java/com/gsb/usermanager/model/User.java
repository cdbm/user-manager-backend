package com.gsb.usermanager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
	private @Id @GeneratedValue Long id;
	private String name;
	private String role;
	
	
	public User() {}
	
	public User(String name, String role) {
		this.name = name;
		this.role = role;
	}
	
}
