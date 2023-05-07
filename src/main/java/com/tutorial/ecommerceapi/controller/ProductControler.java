package com.tutorial.ecommerceapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.ecommerceapi.Service.ProductService;
import com.tutorial.ecommerceapi.model.Product;

@RestController
@RequestMapping("/product")
public class ProductControler {
	
	
	@Autowired
	private ProductService productService;
	
	
	
	@PostMapping("/add")
	public void addProduct(@RequestBody Product product) {
		
		productService.addProduct(product);
		
		
		
	}
	
	@GetMapping("/all")
	
	public List<Product>getAllProduct(){
		
	return	productService.getAllProduct();
	}
	
	@GetMapping("/category/{category}")
	
	public List<Product>getProductByCategory(@PathVariable ("category") String category){
		
		
		return productService.getProductByCategory(category);
		
	}
	@DeleteMapping("/id/{id}")
	
	public void deleteProductById(@PathVariable ("id") Long id) {
		
		productService.deleteProductById(id);
	}
	
			

}
