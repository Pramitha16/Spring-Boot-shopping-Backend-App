package com.shopping.model;

public class Product {
private String name;
private int price;
private int quantity;
private String address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Product(String name, int price, int quantity, String address) {
	super();
	this.name = name;
	this.price = price;
	this.quantity = quantity;
	this.address = address;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}

}
