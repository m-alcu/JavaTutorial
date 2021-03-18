
/**
 * Interface Example One
 */
public class InterfaceExample {

	public static void main(String[] args) {

//		new Animal(); // Not Allowed.

		Animal2 animal = new Dog2();
		animal.eat();
		animal.run();
	}
}

interface Animal2 {

	public static final float pi = 3.14f;

	abstract public void run();

	abstract public void eat();

}

class Dog2 implements Animal2 {

	@Override
	public void run() {
		System.out.println("Dog is running");
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}
}

/*
 * Rules of Interface * You cannot create object of interface. They are just a
 * blueprint of a class. * Use implements keyword * They can only contain
 * abstract methods.
 *
 * 1. For Methods * They are public and abstract * No method body. You cannot
 * write code within your method.
 *
 * 2. For Variables * Avoid using field variables * But when used they are
 * constants. Their values cannot be changed once defined. * They are public,
 * static and final
 *
 */
