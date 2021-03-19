package ClassObjects;

/**
 * Interface Example Two
 */
public class InterfaceExampleTwo {

	public static void main(String[] args) {

		Remote remote = new Television();
		remote.powerOn();
		remote.volumeUp();
		remote.powerOff();
	}
}

interface Remote {

	void powerOn();

	void powerOff();

	void volumeUp();

	void volumeDown();
}

class Television implements Remote {

	public void powerOn() {
		System.out.println("Power On");
	}

	public void powerOff() {
		System.out.println("Power Off");
	}

	public void volumeUp() {
		System.out.println("Volume Up");
	}

	public void volumeDown() {
		System.out.println("Volume Down");
	}
}
