package Solid.DIP.Bien;

public class CreditCard implements PaymentMethod {

	@Override
	public void pay(Shopping shopping) {
		System.out.println("Paying by card");
	}
}