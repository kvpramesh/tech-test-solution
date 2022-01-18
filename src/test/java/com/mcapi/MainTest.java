package test.java.com.mcapi;

import static org.junit.jupiter.api.Assertions.*;
import main.java.com.mcapi.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

	ShoppingCart cart = new ShoppingCart();
	ShoppingCart cart2 = new ShoppingCart();

	@BeforeEach
	void setUp() throws Exception {
		// creates new items with product name and unit price
		Item i1 = new Item("A", 4, 15.0);
		Item i2 = new Item("B", 3, 9.0);
		Item i3 = new Item("X", 1, 10.0);
		Item i4 = new Item("Y", 3, 5.0);
		Item i5 = new Item("Z", 3, 4.0);
		Item i6 = new Item("P", 9, 0);
		Item i7 = new Item("Q", 5, 1.5);
		Item i8 = new Item("R", 1, 2.5);


		/* add the item to the cart */
		cart.addToCart(i1);
		cart.addToCart(i2);

		cart2.addToCart(i3);
		cart2.addToCart(i4);
		cart2.addToCart(i5);
		cart2.addToCart(i6);
		cart2.addToCart(i7);
		cart2.addToCart(i8);
	}

	@Test
	void test1() {
		assertEquals(73.5, cart.getTotalAmount_example1());
	}

	@Test
	void test2() {
		assertEquals(35, cart2.getTotalAmount_example2());
	}

}
