package Streams.BasicsDay2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Q03_ReverseEachWordOfTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java Concept Of The Day";
        
		String reversedStr = Arrays.stream(str.split(" "))
			  .map(word-> new StringBuffer(word).reverse())
			  .collect(Collectors.joining(" "));
		
		System.out.println(reversedStr);
	}

}
