package Streams.BasicsDay2;

import java.util.stream.IntStream;

public class Q08_PalindromeUsingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ROTATOR";
		
		boolean isPalindrome = IntStream.range(0, str.length()/2)
				 .noneMatch(i->str.charAt(i) != str.charAt(str.length()-i-1));
		
		if(isPalindrome) {
			System.out.println(str+" is a Palindrome.");
		}
		else {
			System.out.println(str+" is not a Palindrome.");
		}
         
	}

}
