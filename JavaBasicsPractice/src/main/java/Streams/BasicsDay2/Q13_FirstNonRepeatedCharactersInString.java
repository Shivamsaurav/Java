package Streams.BasicsDay2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q13_FirstNonRepeatedCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
		
		Set<String> uniqueElements = new HashSet<>();
		
		String firstNonRepeatedChar = Arrays.stream(inputString.split(""))
			  .filter(ch -> uniqueElements.add(ch))
			  .findFirst()
			  .get();
		
		System.out.println(firstNonRepeatedChar);
	}
}