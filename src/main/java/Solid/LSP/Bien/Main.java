package Solid.LSP.Bien;

public class Main {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(5, 4);
		System.out.println("Area rectangulo");
		System.out.println("Lado1: " + r.getWidth());
		System.out.println("Lado2: " + r.getHeight());
		System.out.println("Area: " + r.calculateArea());

		Square s = new Square(4);
		System.out.println("Area cuadrado");
		System.out.println("Lado1: " + s.getWidth());
		System.out.println("Lado2: " + s.getHeight());
		System.out.println("Area: " + s.calculateArea());

	}
}