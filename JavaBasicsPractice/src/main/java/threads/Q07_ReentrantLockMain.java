package threads;

public class Q07_ReentrantLockMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Q07_ReentrantLock obj1 = new Q07_ReentrantLock();
		Q07_ReentrantLock obj2 = new Q07_ReentrantLock();
		
		Thread t1 = new Thread(()->{
			for(int i=0;i<1000;i++) {
				obj1.increment();
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=0;i<1000;i++) {
				obj2.increment();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("obj1 count: " + obj1.getCount()); // obj1 count: 2000
        System.out.println("obj2 count: " + obj2.getCount()); // obj2 count: 2000
	}

}
