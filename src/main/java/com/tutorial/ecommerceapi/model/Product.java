package com.tutorial.ecommerceapi.model;




import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_product")
public class Product {
	

	@Id
	@SequenceGenerator(name = "product_sequence",
	sequenceName = "product_sequence",
	allocationSize = 1,
	initialValue = 1000
			)
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator = "product_sequence")
	private Long productId;
	@NonNull
	private String productName;
	@NonNull
	private Double productPrize;
	@Size(min=10,max = 100)
	private String produatDescription;
	@NotEmpty
	private String productCategory;
	private String productBrand;

	

}
