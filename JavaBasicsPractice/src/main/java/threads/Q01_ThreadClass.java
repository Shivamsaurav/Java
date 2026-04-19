package threads;

public class Q01_ThreadClass extends Thread{

	@Override
	public void run() {
		System.out.println("Thread running");
		System.out.println("Thread Name : "+Thread.currentThread().getName());
	}
}
