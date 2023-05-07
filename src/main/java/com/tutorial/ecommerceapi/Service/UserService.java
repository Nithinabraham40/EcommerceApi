package com.tutorial.ecommerceapi.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.ecommerceapi.model.User;
import com.tutorial.ecommerceapi.repository.UserRepo;

@Service
public class UserService {

	
	@Autowired
	private UserRepo userRepo;

	public void adduser(User user) {
		userRepo.save(user);
		
	}

	public List<User> getAllUsers() {
		
		
		 List<User>listOfUsers= userRepo.findAll();
		 
		 return listOfUsers;
		 
		 
	}

	public User getUserById(Long id) {
		
		Optional<User> user=userRepo.findById(id);
		
		if(user.isPresent()) {
			return user.get();
		}
		
		return null;
	}

	
	
	
}
