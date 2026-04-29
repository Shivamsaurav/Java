package threads;

import java.util.concurrent.locks.ReentrantLock;

public class Q07_ReentrantLock {
	
	private static int count = 0;
	private static final ReentrantLock lock = new ReentrantLock();
	
	public void increment() {
		lock.lock();		// acquire lock
		try {
			count++;
		}
		finally {
			lock.unlock(); // always release lock
		}
	}
	
	public int getCount() {
		return count;
	}

}
