package threads;

class UserService implements Runnable{

	@Override
	public void run() {
		System.out.println("Fetching user data...");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			
		}
		System.out.println("User data ready");	
	}
	
}

class OrderService extends Thread{
	
	@Override
	public void run() {
		System.out.println("Fetching order data...");
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			
		}
		System.out.println("Order data ready");
	}
}

public class Q05_JoinMethodExample {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		UserService userService = new UserService();
		Thread userThread = new Thread(userService);
		
		OrderService orderThread = new OrderService();
		
		userThread.start();
		orderThread.start();
		
		// t.join() blocks the calling thread until thread t finishes (TERMINATED).
		userThread.join();
		orderThread.join();
		
		System.out.println("Processed result...");
	}

}
