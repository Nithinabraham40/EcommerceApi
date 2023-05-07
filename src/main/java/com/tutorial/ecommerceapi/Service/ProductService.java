package com.tutorial.ecommerceapi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.ecommerceapi.model.Product;
import com.tutorial.ecommerceapi.repository.ProductRepo;

@Service
public class ProductService {

	
	@Autowired
	
private	ProductRepo productRepo;

	public void addProduct(Product product) {
		
		
		productRepo.save(product);
		
	}

	public List<Product> getProductByCategory(String category) {
		
		return productRepo.getProductByCategory(category);
	}

	public void deleteProductById(Long id) {
		productRepo.deleteById(id);
		
	}

	public List<Product> getAllProduct() {
		
		return productRepo.findAll();
	}
	
	
	
	
}
