package threads;

public class Q02_RunnableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		
		Q02_RunnableInterface runnableInterface = new Q02_RunnableInterface();
		
		Thread thread = new Thread(runnableInterface);
		
		thread.start(); // internally calls run
		
		/* Creating a Runnable object does NOT create a thread.
		 * To actually create and run a thread:
 		 * Pass the runnable object to the Thread class
 		 * Call start() → JVM creates a new thread → invokes run() internally
		 */

		
	}

}
