package com.exercices.entities;

public class Product {
	private String productName;
	private Double price;
	private Integer amount;
	
	public Product(String productName, Double price, Integer amount) {
		super();
		this.productName = productName;
		this.price = price;
		this.amount = amount;
		
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	private Double totalPrice() {
		return price * amount;
	}
	
	@Override
	public String toString() {
		return productName + "," + totalPrice();
	}
	
}
