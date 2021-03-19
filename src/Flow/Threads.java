package Flow;

public class Threads extends Thread {

	public static int amount = 0;

	public static void main(String[] args) {
		Threads thread = new Threads();
		thread.start();
		System.out.println("This code is outside of the thread");
		System.out.println(amount);
		amount++;
		System.out.println(amount);
	}

	public void run() {
		System.out.println("This code is running in a thread");
		amount++;
	}
}