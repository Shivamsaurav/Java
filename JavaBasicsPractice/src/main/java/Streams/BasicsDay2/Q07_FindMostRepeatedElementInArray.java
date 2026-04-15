package Streams.BasicsDay2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q07_FindMostRepeatedElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        
		Map<String, Long> freqMap = listOfStrings.stream()
		 			 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		Entry<String, Long> mostFrequentElement = freqMap.entrySet()
														 .stream()
														 .max(Map.Entry.comparingByValue())
														 .get();
		
		System.out.println("Most Frequent Element : "+mostFrequentElement.getKey());
		System.out.println("Count : "+mostFrequentElement.getValue());
	}

}
