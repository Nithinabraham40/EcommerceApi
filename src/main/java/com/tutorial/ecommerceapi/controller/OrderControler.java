package com.tutorial.ecommerceapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.ecommerceapi.Service.OrderService;
import com.tutorial.ecommerceapi.model.Order;

@RestController
@RequestMapping("/order")
public class OrderControler {
	
	
	@Autowired
	private OrderService orderService;

	

  @PostMapping("/add")
  
  public void addOrder(@RequestBody Order order) {
	  
	  
	  orderService.addOrder(order);
	  
	  
  }
  
  @GetMapping("id/{id}")
  
  public Order getById(@PathVariable Long id) {
	  
	  
	 return orderService.getById(id);
  }
 @GetMapping("all")
 public List<Order>getAllOrders(){
	 
	 return orderService.getAllOrders();
 }
	
	
	
	
}
