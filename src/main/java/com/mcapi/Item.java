package main.java.com.mcapi;

public class Item {

	private String productName;
	private int quantity;
	private double unitPrice;

	//Constructor
	public Item(String productName, int quantity, double unitPrice) {
		this.productName = productName;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	//Getters
	public String getProductName() {
		return this.productName;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public double getUnitPrice() {
		return this.unitPrice;
	}

}
