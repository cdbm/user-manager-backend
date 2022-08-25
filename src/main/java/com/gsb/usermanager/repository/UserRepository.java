package com.gsb.usermanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gsb.usermanager.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
