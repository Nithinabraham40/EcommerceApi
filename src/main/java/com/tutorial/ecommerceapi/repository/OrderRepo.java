package com.tutorial.ecommerceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.ecommerceapi.model.Order;

public interface OrderRepo extends JpaRepository<Order, Long>  {

}
