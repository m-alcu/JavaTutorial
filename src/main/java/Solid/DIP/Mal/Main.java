package Solid.DIP.Mal;

public class Main {

	public static void main(String[] args) {

		Shopping shopping = new Shopping();
		ShoppingBasket shoppingBasket = new ShoppingBasket();
		shoppingBasket.buy(shopping);

	}
}