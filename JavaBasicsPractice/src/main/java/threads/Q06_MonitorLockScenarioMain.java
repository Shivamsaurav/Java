package threads;

public class Q06_MonitorLockScenarioMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Q06_MonitorLockScenario obj1 = new Q06_MonitorLockScenario();
		Q06_MonitorLockScenario obj2 = new Q06_MonitorLockScenario();
		
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
		
		System.out.println("obj1 count: " + obj1.getCount()); // obj1 count: 1993 [not fixed output]
        System.out.println("obj2 count: " + obj2.getCount()); // obj2 count: 1993 [not fixed output]
		/*
		 * “synchronized works at the object level. If multiple threads operate 
		 * on different instances, each has its own lock, so synchronization 
		 * does not apply across them. This can lead to race conditions 
		 * if the underlying resource is shared.”
		 */
	}

}
