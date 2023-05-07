package com.tutorial.ecommerceapi.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.ecommerceapi.model.Order;
import com.tutorial.ecommerceapi.repository.AddressRepo;
import com.tutorial.ecommerceapi.repository.OrderRepo;

@Service
public class OrderService {

	
	@Autowired
	
	private OrderRepo orderRepo;

	public void addOrder(Order order) {
		
		
		orderRepo.save(order);
		
	}

	public Order getById(Long id) {
		
		Optional<Order> orderFind= orderRepo.findById(id);
		if(orderFind.isPresent()) {
			return orderFind.get();
		}
		return null;
		
		
	}

	public List<Order> getAllOrders() {
		
		return orderRepo.findAll();
	}
	
	
}
