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

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tbl_address")
public class Address {


	@Id
	@SequenceGenerator(name = "address_sequence",
	
sequenceName = "address_sequence",
allocationSize = 1,
initialValue = 500
			)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
	generator ="address_sequence" )
	private Long addresId;
	@Size(min=3,max=50)
	private String houseName;
	@Size(min=10,max=50)
	private String landmark;
	private String phNumber;
	@NonNull
	private String zipCode;
	@NonNull
	private String state;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "fk_user_userId")
	private User user;
	
//	@OneToOne(mappedBy = "address")
//	private Order order;
	

	
	
	
}
