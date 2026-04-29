package threads;

public class Q09_ReentrantLockScenarioTwoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q09_ReentrantLockScenarioTwo service = new Q09_ReentrantLockScenarioTwo(); // 🔥 ONE shared object

        Thread t1 = new Thread(service::processPayment, "T1");
        Thread t2 = new Thread(service::processPayment, "T2");

        t1.start();
        t2.start();
	}
	/*
	 * T1 started
	 * T2 skipped ❌
	 * T1 finished
	 * 
	 * In this example, both threads share the same PaymentService instance, 
	 * so they also share the same ReentrantLock. Using tryLock ensures that 
	 * only one thread processes the payment, while others skip instead of waiting.
	 */
}
