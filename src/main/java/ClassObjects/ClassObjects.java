package ClassObjects;

/**
 *
 * Class, Objects, Instance and Field Variable
 */
public class ClassObjects {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		r1.setLength(10);
		r1.setBreadth(20);

		Rectangle r2 = r1;
		r2.setLength(50);
		r2.setBreadth(100);

		Rectangle r3 = new Rectangle();
		Rectangle r4 = new Rectangle();
		Rectangle r5 = new Rectangle();

		System.out.println(r1.getBreadth());
		System.out.println(r1.getLength());
	}

}
