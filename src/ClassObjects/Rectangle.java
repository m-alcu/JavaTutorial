package ClassObjects;

public class Rectangle {

	int length; // or it can be float
	int breadth;

	public float getArea() {

		float area = length * breadth;
		return area;
	}

	public float findPerimeter() {

		int p = 2 * (length + breadth);
		return p;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
}