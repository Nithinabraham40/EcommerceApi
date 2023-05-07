package com.tutorial.ecommerceapi.model;



import io.micrometer.common.lang.NonNull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_order")
public class Order {
	

	
	@Id
	@SequenceGenerator(name = "order_sequence",
sequenceName = "order_sequence",
allocationSize = 1,
initialValue = 10000
			)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "order_sequence")
	private Long orderId;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "fk_user_userid")
	private User user;
	
	
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="fk_address_addressId")
	private Address address;
	
	
	
	@NonNull
	private int productQuantity;
	
   
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="fk_product_productId")
	
    private Product product;

}
