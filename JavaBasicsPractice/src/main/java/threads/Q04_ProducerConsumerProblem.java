package threads;

import java.util.LinkedList;
import java.util.Queue;

public class Q04_ProducerConsumerProblem {

	private Queue<Integer> sharedBuffer;
	private int bufferSize;
	
	public Q04_ProducerConsumerProblem(int bufferSize) {

		this.sharedBuffer = new LinkedList<>();
		this.bufferSize = bufferSize;
	}
	
	// PRODUCER METHOD
	public synchronized void produce(int item) throws Exception {
		
		while(sharedBuffer.size() == bufferSize) {
			System.out.println("Buffer is full, PRODUCER is waiting...");
			wait(); // wait until Consumer consumes
		}
		sharedBuffer.add(item);
		System.out.println("Produced : "+item);
		
		notify(); // wake up consumer
	}
	
	// CONSUMER METHOD
	public synchronized int consumer() throws Exception{
		
		while(sharedBuffer.isEmpty()) {
			System.out.println("Buffer is empty, CONSUMER is waiting...");
			wait(); // wait until producer adds item
		}
		int item = sharedBuffer.poll();
		System.out.println("Consumed : "+item);
		
		notify(); // wake up producer
		
		return item;
	}
	

}
