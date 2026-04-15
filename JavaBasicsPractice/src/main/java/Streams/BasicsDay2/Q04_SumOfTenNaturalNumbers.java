package Streams.BasicsDay2;

import java.util.stream.IntStream;

public class Q04_SumOfTenNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = IntStream.range(1, 11).sum();
		
		System.out.println(sum);
	}

}
