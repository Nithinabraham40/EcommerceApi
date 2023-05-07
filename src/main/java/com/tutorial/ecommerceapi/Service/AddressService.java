package com.tutorial.ecommerceapi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.ecommerceapi.model.Address;
import com.tutorial.ecommerceapi.repository.AddressRepo;

import jakarta.transaction.Transactional;
@Service
public class AddressService {
	
	@Autowired
	private AddressRepo addressRepo;

	
	public void addAddress(Address address) {
		
		
		addressRepo.save(address);
		
	}


	public List<Address> getAllAddress() {
		
		return addressRepo.findAll();
	}


	
	
	

}
