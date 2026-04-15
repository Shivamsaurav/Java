package Streams.BasicsDay1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q12_CheckIfTwoStringsAreAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "RaceCar";
        String s2 = "CarRace";
        
        String newS1 = Stream.of(s1.split(""))
        		             .map(String::toUpperCase)
        		             .sorted()
        		             .collect(Collectors.joining());
        
        String newS2 = Stream.of(s2.split(""))
        					 .map(String::toUpperCase)
        					 .sorted()
        					 .collect(Collectors.joining());
        
        if(newS1.equals(newS2)) {
        	System.out.println("Two strings are anagrams.");
        }
        else {
        	System.out.println("Two strings are not anagrams.");
        }
        
	}

}
