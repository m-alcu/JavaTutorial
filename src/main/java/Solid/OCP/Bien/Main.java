package Solid.OCP.Bien;

public class Main {

	public static void draw(Vehicle vehicle) {
		vehicle.draw();
	}

	public static void main(String[] args) {

		Car car = new Car();
		draw(car);
	}
}