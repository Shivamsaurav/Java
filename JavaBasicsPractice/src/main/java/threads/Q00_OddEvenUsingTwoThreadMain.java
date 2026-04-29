package threads;

public class Q00_OddEvenUsingTwoThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q00_OddEvenUsingTwoThread numberPrint = new Q00_OddEvenUsingTwoThread();
		
		Thread t1 = new Thread(()->numberPrint.printOdd());
		Thread t2 = new Thread(()->numberPrint.printEven());
		
		t1.start();
		t2.start();

		/*
		 * wait() → Releases the lock and pauses the thread until another thread notifies it.
		 * notify() → Wakes up one waiting thread (chosen randomly) on the same object.
		 * notifyAll() → Wakes up all waiting threads on the same object.
		 */
	}

}
