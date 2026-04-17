package Streams.BasicsDay2;

import java.util.Arrays;
import java.util.List;

public class Q09_FindStringsWhichStartWithNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
		
		listOfStrings.stream()
					 .filter(str->Character.isDigit(str.charAt(0)))
					 .forEach(System.out::println);
        
	}

}
