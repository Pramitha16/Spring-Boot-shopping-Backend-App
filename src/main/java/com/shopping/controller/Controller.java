package com.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.model.Customer;
import com.shopping.model.Product;
import com.shopping.service.CustomerDaoService;
import com.shopping.service.ShoppingService;

@RestController
public class Controller {
     @Autowired
	private CustomerDaoService custService;
	
     
     @GetMapping("/customers")
     public List<Customer> getAllCustomer(){
    	 return custService.getCustomers();
     }
    	 
    	@PostMapping("/addCustomer")
    	 public void addCustomer(@RequestBody Customer customer) {
    		 custService.addCustomer(customer); 
    	}
    	 @PutMapping("/updateCustomer")
    	 public void updateCustomer(@RequestBody Customer customer) {
    		 custService.updateCustomer(customer);
    		 
    	 }
     

}
