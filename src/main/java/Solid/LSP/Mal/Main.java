package Solid.LSP.Mal;

public class Main {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		System.out.println("Area rectangulo");
		r.setWidth(5);
		System.out.println("Lado1: " + r.getWidth());
		r.setHeight(4);
		System.out.println("Lado2: " + r.getHeight());
		System.out.println("Area: " + r.calculateArea());

		Square s = new Square();
		System.out.println("Area cuadrado");
		s.setWidth(5);
		System.out.println("Lado1: " + s.getWidth());
		s.setHeight(4);
		System.out.println("Lado2: " + s.getHeight());
		System.out.println("Area: " + s.calculateArea());

	}
}