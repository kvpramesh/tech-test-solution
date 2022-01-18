package main.java.com.mcapi;

import java.util.ArrayList;
import java.util.ListIterator;

public class ShoppingCart {

	ArrayList<Item> item;
	double totalAmount;

	int totalnumOfProdA = 0;
	int totalnumOfProdB = 0;
	int totalnumOfProdX = 0;
	int totalnumOfProdY = 0;
	int totalnumOfProdZ = 0;
	int totalnumOfProdP = 0;
	int totalnumOfProdQ = 0;
	int totalnumOfProdR = 0;

	double unitPriceOfA = 0;
	double unitPriceOfB = 0;
	double unitPriceOfX = 0;
	double unitPriceOfY = 0;
	double unitPriceOfZ = 0;
	double unitPriceOfP = 0;
	double unitPriceOfQ = 0;
	double unitPriceOfR = 0;

	double totalAmtOfProdA = 0;
	double totalAmtOfProdB = 0;
	double totalAmtOfProdX = 0;
	double totalAmtOfProdY = 0;
	double totalAmtOfProdZ = 0;
	double totalAmtOfProdP = 0;
	double totalAmtOfProdQ = 0;
	double totalAmtOfProdR = 0;

	public ShoppingCart() {
		this.item = new ArrayList<Item>();
		this.totalAmount = 0;
	}

	public void addToCart(Item item) {
		this.item.add(item);
	}

	// Calculates total price for example1.
	// Cart has only 2 products ('A' and 'B')
	public double getTotalAmount_example1() {
		ListIterator<Item> iterator1 = item.listIterator();
		ListIterator<Item> iterator2 = item.listIterator();

		while(iterator1.hasNext()) {
			Item item1 = iterator1.next();
			if (item1.getProductName().equals("A")) {
				totalnumOfProdA = item1.getQuantity();
				unitPriceOfA = item1.getUnitPrice();
			}
		}
		while(iterator2.hasNext()) {
			Item item2 = iterator2.next();
			if (item2.getProductName().equals("B")) {
				totalnumOfProdB = item2.getQuantity();
				unitPriceOfB = item2.getUnitPrice();
			}
		}

		totalAmtOfProdA = totalnumOfProdA * unitPriceOfA;
		totalAmtOfProdB = totalnumOfProdB * unitPriceOfB;
		int numOfBsForDiscount = 0;

		// Based on number of product 'A', product 'B's price needs to be calculated.
		if(totalnumOfProdA >= totalnumOfProdB) {
			totalAmtOfProdB = totalAmtOfProdB / 2;
			this.totalAmount = totalAmtOfProdA + totalAmtOfProdB;
		}
		else if(totalnumOfProdA < totalnumOfProdB) {
			numOfBsForDiscount = totalnumOfProdA;
			this.totalAmount = (totalAmtOfProdA + (numOfBsForDiscount * unitPriceOfB / 2) + (unitPriceOfB * (totalnumOfProdB - numOfBsForDiscount)));
		}

		return this.totalAmount;
	}

	// Calculating total amount for example2
	// Cart has products 'X', 'Y', 'Z', 'P', 'Q' and 'R'
	public double getTotalAmount_example2() {

		ListIterator<Item> iterator3 = item.listIterator();
		ListIterator<Item> iterator4 = item.listIterator();
		ListIterator<Item> iterator5 = item.listIterator();
		ListIterator<Item> iterator6 = item.listIterator();
		ListIterator<Item> iterator7 = item.listIterator();
		ListIterator<Item> iterator8 = item.listIterator();

		while(iterator3.hasNext()) {
			Item item3 = iterator3.next();
			if (item3.getProductName().equals("X")) {
				totalnumOfProdX = item3.getQuantity();
				unitPriceOfX = item3.getUnitPrice();
			}
		}
		while(iterator4.hasNext()) {
			Item item4 = iterator4.next();
			if (item4.getProductName().equals("Y")) {
				totalnumOfProdY = item4.getQuantity();
				unitPriceOfY = item4.getUnitPrice();
			}
		}
		while(iterator5.hasNext()) {
			Item item5 = iterator5.next();
			if (item5.getProductName().equals("Z")) {
				totalnumOfProdZ = item5.getQuantity();
				unitPriceOfZ = item5.getUnitPrice();
			}
		}
		while(iterator6.hasNext()) {
			Item item6 = iterator6.next();
			if (item6.getProductName().equals("P")) {
				totalnumOfProdP = item6.getQuantity();
				unitPriceOfP = item6.getUnitPrice();
			}
		}
		while(iterator7.hasNext()) {
			Item item7 = iterator7.next();
			if (item7.getProductName().equals("Q")) {
				totalnumOfProdQ = item7.getQuantity();
				unitPriceOfQ = item7.getUnitPrice();
			}
		}
		while(iterator8.hasNext()) {
			Item item8 = iterator8.next();
			if (item8.getProductName().equals("R")) {
				totalnumOfProdR = item8.getQuantity();
				unitPriceOfR = item8.getUnitPrice();
			}
		}

		totalAmtOfProdX = totalnumOfProdX * unitPriceOfX;
		totalAmtOfProdY = totalnumOfProdY * unitPriceOfY;
		totalAmtOfProdZ = totalnumOfProdZ * unitPriceOfZ;
		totalAmtOfProdP = totalnumOfProdP * unitPriceOfP;
		totalAmtOfProdQ = totalnumOfProdQ * unitPriceOfQ;
		totalAmtOfProdR = totalnumOfProdR * unitPriceOfR;

		// Since product 'Z' is free, its amount is not included.
		this.totalAmount = (totalAmtOfProdX + totalAmtOfProdY + totalAmtOfProdP + totalAmtOfProdQ + totalAmtOfProdR);

		return totalAmount;
	}
}	


