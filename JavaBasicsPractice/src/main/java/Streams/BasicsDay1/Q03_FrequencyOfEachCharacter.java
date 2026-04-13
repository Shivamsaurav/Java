package Streams.BasicsDay1;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q03_FrequencyOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = "Java Concept Of The Day";
		
		Map<Character, Long> charCountMap = inputString.chars()
				   .mapToObj(ch -> (char) ch)
				   .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(charCountMap);
	}

}
