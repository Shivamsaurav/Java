package threads;

public class Q01_ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Thread Name : "+Thread.currentThread().getName());
		
		Q01_ThreadClass thread = new Q01_ThreadClass();
		
		thread.start(); // internally calls run
	}

}
