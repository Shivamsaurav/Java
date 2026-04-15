package Streams.BasicsDay1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q13_SumOfAllDigitsOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 15623;
		
		Integer sumOfDigits = Stream.of(String.valueOf(i).split(""))
				 					.collect(Collectors.summingInt(Integer::parseInt));
		
		System.out.println(sumOfDigits);
	}

}
