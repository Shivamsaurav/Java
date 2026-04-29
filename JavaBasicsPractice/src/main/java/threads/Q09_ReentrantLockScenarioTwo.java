package threads;

import java.util.concurrent.locks.ReentrantLock;

public class Q09_ReentrantLockScenarioTwo {
	
	private final ReentrantLock lock = new ReentrantLock();
	
	public void processPayment() {
		if(lock.tryLock()) {
			try {
				System.out.println(Thread.currentThread().getName()+" started");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+" finished");
			}
			catch (InterruptedException e) {
			}
			finally {
				lock.unlock();
			}
			
		}else {
			System.out.println(Thread.currentThread().getName()+" skipped ❌");
		}
	}

}
