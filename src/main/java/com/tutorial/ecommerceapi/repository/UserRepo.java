package com.tutorial.ecommerceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.ecommerceapi.model.User;

public interface UserRepo extends JpaRepository<User, Long>{

	
	
}
