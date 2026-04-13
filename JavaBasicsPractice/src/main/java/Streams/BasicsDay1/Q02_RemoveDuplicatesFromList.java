package Streams.BasicsDay1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q02_RemoveDuplicatesFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		
		List<String> uniqueList = listOfStrings.stream()
					.distinct()
					.collect(Collectors.toList());
		
		System.out.println(uniqueList);
        
	}

}
