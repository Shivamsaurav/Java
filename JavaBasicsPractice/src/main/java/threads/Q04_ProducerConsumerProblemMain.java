package threads;

public class Q04_ProducerConsumerProblemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q04_ProducerConsumerProblem resource = new Q04_ProducerConsumerProblem(3);
		
		Thread producerThread = new Thread(() -> {
			try {
				for(int i=0;i<=6;i++) {
					resource.produce(i);
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		});
		
		Thread consumerThread = new Thread(() -> {
			try {
				for(int i=0;i<=6;i++) {
					resource.consumer();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		});
		
		producerThread.start();
		consumerThread.start();
	}

}
