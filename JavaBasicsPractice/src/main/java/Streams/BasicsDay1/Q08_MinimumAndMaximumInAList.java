package Streams.BasicsDay1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q08_MinimumAndMaximumInAList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		
		Integer maxElement = listOfIntegers.stream()
										   .max(Comparator.naturalOrder())
										   .get();
		System.out.println("Maximum Element : "+maxElement);
		
		Integer minElement = listOfIntegers.stream()
				   .min(Comparator.naturalOrder())
				   .get();
        System.out.println("Minimum Element : "+minElement);
        
	}

}
