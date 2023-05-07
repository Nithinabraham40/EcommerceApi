package com.tutorial.ecommerceapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tutorial.ecommerceapi.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

	
	@Query(
			value = "select * from tbl_product where product_category=:category",
			nativeQuery = true
			
			)
	List<Product> getProductByCategory(String category);

}
