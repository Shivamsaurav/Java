package Streams.BasicsDay1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q15_SortStringsAccordingToTheirLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C", "Jave");
        
		System.out.println("-----------------------------");
		System.out.println("Sorted In Increasing Order : ");
		System.out.println("-----------------------------");
		
		listOfStrings.stream()
		 			 .sorted(Comparator.comparing(String::length))
		 			 .forEach(System.out::println);
		
		System.out.println("-----------------------------");
		System.out.println("Sorted In Decreasing Order : ");
		System.out.println("-----------------------------");
		
		listOfStrings.stream()
		 			 .sorted(Comparator.comparing(String::length).reversed())
		 			 .forEach(System.out::println);
		
		System.out.println("-----------------------------");
		System.out.println("Sorted In Decreasing Order and if lengths are equal, sort alphabetically: ");
		System.out.println("-----------------------------");
		listOfStrings.stream()
		 .sorted(Comparator.comparing(String::length)
				           .reversed()
				           .thenComparing(Comparator.naturalOrder()))
		 .forEach(System.out::println);
	}

}
