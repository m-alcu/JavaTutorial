package Solid.OCP.Mal;

public class Main {

	public static void draw(Vehicle vehicle) {
		switch (vehicle.getType()) {
		case CAR:
			drawCar(vehicle);
			break;
		case MOTORBIKE:
			drawMotorbike(vehicle);
			break;
		}
	}

	public static void drawCar(Vehicle vehicle) {
		System.out.println("drawCar");
	}

	public static void drawMotorbike(Vehicle vehicle) {
		System.out.println("drawMotorbike");
	}

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		vehicle.setType(VehicleType.CAR);
		draw(vehicle);
	}
}