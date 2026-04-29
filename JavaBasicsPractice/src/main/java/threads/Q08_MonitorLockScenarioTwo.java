package threads;

public class Q08_MonitorLockScenarioTwo {

	public synchronized void processPayment() {
		
		System.out.println(Thread.currentThread().getName()+" started");
		
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {	
			
		}
		
		System.out.println(Thread.currentThread().getName()+" finished");
	}
}
