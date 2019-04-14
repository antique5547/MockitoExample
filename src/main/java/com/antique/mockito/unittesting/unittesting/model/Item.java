package com.antique.mockito.unittesting.unittesting.model;

public class Item {

	private int quantity;
	private int price;
	private String name;
	private int id;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int id, String name, int price, int quantity) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
