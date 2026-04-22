package threads;

public class Q03_IntrensicMonitorLock {
	
	// synchronized method
	public synchronized void task1() {
		System.out.println("task1 : inside synchronized block...");
		
		try {
			System.out.println("task1: thread execution..."); // holds the thread for 10 seconds
			Thread.sleep(10000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void task2() {
		System.out.println("task2 : before synchronized block...");
		
		synchronized (this) {
			System.out.println("task2 : inside synchronized block...");
		}
	}
	
	public void task3() {
		System.out.println("task3 : outside synchronized block...");
	}
	
}
