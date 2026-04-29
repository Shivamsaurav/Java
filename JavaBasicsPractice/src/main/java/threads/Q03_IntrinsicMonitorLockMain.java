package threads;

public class Q03_IntrinsicMonitorLockMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q03_IntrinsicMonitorLock obj = new Q03_IntrinsicMonitorLock();
		
		Thread t1 = new Thread(()->obj.task1());
		Thread t2 = new Thread(()->obj.task2());
		Thread t3 = new Thread(()->obj.task3());

		t1.start();
		t2.start();
		t3.start();
	}

}
