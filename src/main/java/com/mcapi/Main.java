package main.java.com.mcapi;

class Main {

	public static void main(String[] args) {

		try {
			// creates new items with product name and unit price
			Item i1 = new Item("A", 1, 10.0);
			Item i2 = new Item("B", 2, 9.0);

			Item i3 = new Item("X", 1, 10.0);
			Item i4 = new Item("Y", 3, 5.0);
			Item i5 = new Item("Z", 3, 4.0);
			Item i6 = new Item("P", 9, 9.0);
			Item i7 = new Item("Q", 5, 1.5);
			Item i8 = new Item("R", 1, 2.5);

			ShoppingCart cart = new ShoppingCart();
			ShoppingCart cart2 = new ShoppingCart();

			/* add the items to the cart */
			cart.addToCart(i1);
			cart.addToCart(i2);

			cart2.addToCart(i3);
			cart2.addToCart(i4);
			cart2.addToCart(i5);
			cart2.addToCart(i6);
			cart2.addToCart(i7);
			cart2.addToCart(i8);

			double totalAmount = 0.0;
			// gets the total amount for the items in the cart
			totalAmount = cart.getTotalAmount_example1();
			System.out.println("Total shopping cart billing amount for example/case 1 : " + totalAmount);

			// gets the total amount for the items in the cart
			totalAmount = cart2.getTotalAmount_example2();
			System.out.println("Total shopping cart billing amount for example/case 2 : " + totalAmount);
		} catch(Exception e) {
			System.out.println("Exception occured : " + e.toString());
		}
	}
}	
