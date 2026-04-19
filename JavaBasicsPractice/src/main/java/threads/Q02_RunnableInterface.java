package threads;

public class Q02_RunnableInterface implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside Runnable Interface Implementation");
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		
	}
}
