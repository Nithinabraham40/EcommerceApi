package com.tutorial.ecommerceapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.ecommerceapi.Service.AddressService;
import com.tutorial.ecommerceapi.model.Address;

@RestController
@RequestMapping("/address")
public class AddressControler {

	
	@Autowired
	private AddressService addressService;
	
	
	@PostMapping("add")
	
	public void addAddress(@RequestBody Address address) {
		
		
		addressService.addAddress(address);
	}
	
	
	@GetMapping("all")
	
	public List<Address> getAllAddress() {
		
		return addressService.getAllAddress();
	}
	
	
	
	
	
}
