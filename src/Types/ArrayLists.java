package Types;

import java.util.ArrayList;
import java.util.List;

// https://stackoverflow.com/questions/2279030/type-list-vs-type-arraylist-in-java

public class ArrayLists {
	public static void main(String[] args) {
		List<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);

		System.out.println(cars.get(0));

		cars.set(0, "Opel");

		System.out.println(cars.get(0));

	}
}