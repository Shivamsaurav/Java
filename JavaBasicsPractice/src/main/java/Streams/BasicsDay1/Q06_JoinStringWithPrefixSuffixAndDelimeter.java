package Streams.BasicsDay1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q06_JoinStringWithPrefixSuffixAndDelimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        
		System.out.println(listOfStrings);
		
		String newString = listOfStrings.stream()
		 			 .collect(Collectors.joining(", ","{","}"));
		
		System.out.println(newString);
		
		/*
		 * If we want prefix and suffix, we must use 
		 * Collectors.joining(delimiter, prefix, suffix) with Stream.
		 * 
		 * Delimiter is the separator that is placed between each element when joining strings.
		 * 
		 * 
		 */
	}

}
