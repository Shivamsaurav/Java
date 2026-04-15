package Streams.BasicsDay1;

import java.util.Arrays;
import java.util.List;

public class Q07_PrintmultipleOfFiveFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		
		listOfIntegers.stream()
					  .filter(num-> num%5 == 0)
					  .forEach(System.out::println);
        
	}

}
