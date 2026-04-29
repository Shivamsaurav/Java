package threads;

public class Q08_MonitorLockScenarioTwoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q08_MonitorLockScenarioTwo service = new Q08_MonitorLockScenarioTwo();
		
		Thread t1 = new Thread(service::processPayment, "T1");
		Thread t2 = new Thread(service::processPayment, "T2");
		
		t1.start();
		t2.start();
		
		/*
		 * T1 started
		 * T1 finished
		 * T2 started
		 * T2 finished
		 * 
		 * “T2 is forced to wait even if we don’t want it to.”
		 * 👉 With synchronized:
		 * No way to say: “If busy, skip”
		 * No tryLock
		 * No timeout
		 */
	}

}
