package threads;

public class Q00_OddEvenUsingTwoThread {

	private int number = 1;
	private final int MAX = 10;
	
	public synchronized void printOdd() {
		while(number<=MAX) {
			if(number%2 == 0) {
				try {
					wait();
				}
				catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
			else {
				System.out.println("Odd : "+number);
				number++;
				notify();
			}
		}
	}
	
	public synchronized void printEven() {
		while(number<=MAX) {
			if(number%2 != 0) {
				try {
					wait();
				}
				catch(InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
			else {
				System.out.println("Even : "+number);
				number++;
				notify();
			}
		}
	}
}
