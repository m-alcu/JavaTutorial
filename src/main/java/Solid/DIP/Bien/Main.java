package Solid.DIP.Bien;

public class Main {

	public static void main(String[] args) {

		Shopping shopping = new Shopping();
		SqlDatabase SqlDatabase = new SqlDatabase();
		CreditCard creditCard = new CreditCard();
		ShoppingBasket shoppingBasket = new ShoppingBasket(SqlDatabase, creditCard);
		shoppingBasket.buy(shopping);

	}
}