package com.tutorial.ecommerceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.ecommerceapi.model.Address;

public interface AddressRepo extends JpaRepository<Address, Long>{

}
