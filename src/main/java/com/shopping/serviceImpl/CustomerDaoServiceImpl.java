package com.shopping.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shopping.model.Customer;
import com.shopping.service.CustomerDaoService;

public class CustomerDaoServiceImpl implements CustomerDaoService {
ArrayList<Customer> customerList=new <Customer>ArrayList();
private Connection connection=null;

public CustomerDaoServiceImpl()
{
	connection=DBUtil.getConnection();
}

@Override
public List<Customer> getCustomers() {
	String getCustomerQuery="SELECT * FROM CUSTOMER;";
	PreparedStatement PreparedStatement;
	PreparedStatement stmt;
	return null;
}

@Override
public void addCustomer(Customer customer) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean customerLoginValidation(String username, String password) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void updateCustomer(Customer customer) {
	int customerid = customer.getCustomerid();
	String customerName = customer.getCustomerName();
	String Gender = customer.getGender();
	long contactNo = customer.getContactNo();
	String email = customer.getEmail();
	String address = customer.getAddress();
	int pincode = customer.getPincode();
	String username = customer.getUsername();
	String password = customer.getPassword();

	
	String updateQuery = "UPDATE customer SET customerName = '"+customerName+"',"
			+ "Gender = '"+Gender+"',"
			+ "contactNo = "+contactNo+","
			+ "email = '"+email+"',"
			+ " address = '"+address+"',"
			+ "pincode = "+pincode+", "
			+ "username = '"+username+"',"
			+ "password = '"+password+"' WHERE customerid = '"+customerid+"';";

	
	PreparedStatement stmt;
	
	try {
		stmt = connection.prepareStatement(updateQuery);
		stmt.executeUpdate();
		System.out.println("Customer data updated successfully");
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		
}

@Override
public void deleteCustomer(String username) {
	// TODO Auto-generated method stub
	
	String deleteQuery = "DELETE FROM CUSTOMER WHERE username='"+username+"'";
PreparedStatement stmt;
	
	try {
		stmt = connection.prepareStatement(deleteQuery);
		stmt.executeUpdate();
		System.out.println("Customer data deleted successfully");
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
}
}