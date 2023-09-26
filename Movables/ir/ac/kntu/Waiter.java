package ir.ac.kntu;

public class Waiter {

	private static Waiter instance = new Waiter();
	
	private Waiter() {
	}
	
	public static Waiter getInstance() {
		return instance;
	}
	
	public void wait(int epochs) {
		for (int i = 0;i < epochs;i++) {
			for (int j = 0;j < 5000000;j++) {
				//Do nothing, but wait
			}
		}
	}
}