# Welcome to readme-md-generator &#x1F44B; 
![example workflow](https://img.shields.io/badge/Eclipse-Version%3A%202022--09%20(4.25.0)-orange)
![example workflow](https://img.shields.io/badge/SpringBoot-2.2.1-yellowgreen)
![example workflow](https://img.shields.io/badge/Java-8-yellowgreen)
![example workflow](https://img.shields.io/badge/Postman-v10.13-orange)
![example workflow](https://img.shields.io/badge/Documentation-Yes-green)
![example workflow](https://img.shields.io/badge/Manitained%3F-Yes-green)
 >CLI that generate beautiful **ReadME**.md files

  :house:  <b><span style="color: blue;">Homepage</span></b>
  


 # Prerequisties

 - **Eclipse >=4.55.0**
 - **Postman >=10.13**
 


# Install
```
Maven Install
SpringTool Install
```
 # Framework And Language

 - **Framework :  SpringBoot**
 - **Language :  Java**

 # Dependencies Required

 - **spring-boot-starter-validation**
 - **spring-boot-starter-web**
 - **spring-boot-devtools**
 - **lombok**
 - **spring-boot-starter-test**
 - **spring-boot-starter-data-jpa**
 - **mysql-connector**


# User Controller


```
@RestController
@RequestMapping("/user")
public class UserControler {

	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public void adduser(@RequestBody User user) {
		
		
		userService.adduser(user);
		
	}
	
	@GetMapping("retrive")
	
	public List<User>getAllUsers(){
		
		
		return userService.getAllUsers();
		
	}
	
	@GetMapping("retrive/id/{id}")
	
```


# Address Controller


```
@RestController
@RequestMapping("/address")
public class AddressControler {

	
	@Autowired
	private AddressService addressService;
	
	
	@PostMapping("add")
	
	public void addAddress(@RequestBody Address address) {
		
		
		addressService.addAddress(address);
	}
	
	
	@GetMapping("all")
	
	public List<Address> getAllAddress() {
		
		return addressService.getAllAddress();
	}
	
	
	
	
	
}
	
```
# Product Controller


```
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

	
```

# Order Controller


```
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

	
```



	
	


  


	







	



# Database Used

<details>
<summary><b><span style="color: white;">Clickme</span></b> &#x1F4F2; </summary>

*Mysql*



</details>

 # Database Design For Address Model

 - **Primary Key :  address_id**
 - **Generationstrategy:  Sequence**
  - **Mapping with user:one to one uni directional**
  - **foreigh key: fk_user_userid**
  
 - **Columns Used:  adress_id,house_name , landmark, fk_user_userid,state,zip_Code,Ph_number**

 # Database Design For User Model

 - **Primary Key :  user_id**
 - **Generationstrategy:  identity**
 - **Columns Used:  user_id,user_name , user_phnumber,user_email,user_password**

# Database Design For Product Model

 - **Primary Key :  product_id**
 - **Generationstrategy:  Sequence**
  
  
 - **Columns Used:  product_id,product_name , product_description, product_prize,product_category,Product_brand**

# Database Design For Order Model

 - **Primary Key :  order_id**
 - **Generationstrategy:  Sequence**
  - **Mapping with user:one to one uni directional**
  -  **Mapping with address:one to one uni directional**
  -   **Mapping with product:one to one uni directional**
  - **foreigh key: fk_user_userid,fk_address_addressid,fk_product_productId**

  
 - **Columns Used:  order_id,product_quantity, fk_address_addressid, fk_user_userid,fk_product_productId**




# Summary

 Spring Project Ecommerce API with models User,address,product,order
The project will have the following attribute
**userName**,
**userId**,
**userPhnumber**,
**userEmail**,
**userPassword**,
**addressId**,
**phnumber**,
**landmark**,
**stateName**,
**zipCode**,
**productId**,
**productname**,
**productDescription**,
**producPrize**,
**productBrand**,
**productCategory**,
**orderId**,
**productQuantity**
. Along with these proper validations are also provided.Used CRUD operation,Custom finders and Custom Query
to do necessary operations.






# :handshake:  Contributing
  Contributions,issues and features request are welcome! 
  

  #


  This *README* was generated with &#x2764;&#xFE0F; by <b><span style="color: blue;">readme-md-generator</span></b> 










   
  
  

