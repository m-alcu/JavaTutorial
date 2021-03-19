package Solid.DIP.Mal;

public class ShoppingBasket {
	public void buy(Shopping shopping) {
		SqlDatabase db = new SqlDatabase();
		db.save(shopping);

		CreditCard creditCard = new CreditCard();
		creditCard.pay(shopping);
	}
}