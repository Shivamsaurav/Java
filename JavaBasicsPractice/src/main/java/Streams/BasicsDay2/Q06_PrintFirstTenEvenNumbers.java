package Streams.BasicsDay2;

import java.util.stream.IntStream;

public class Q06_PrintFirstTenEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntStream.rangeClosed(1, 10).map(i->i*2).forEach(System.out::println);
	}

}
