package Types;

import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		System.out.println(cars);

		// Use addFirst() to add the item to the beginning
		cars.addFirst("Mazda");
		cars.addLast("Mazda");
		System.out.println(cars);

		cars.removeFirst();
		cars.removeLast();
		System.out.println(cars);

	}
}
