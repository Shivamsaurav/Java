package companies.epam;

import java.util.Arrays;

public class LongestWordInASentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is a stream problem";
		
		String longestWord = Arrays.stream(str.split("\\s+"))  // Split by whitespace
			  .max((word1, word2)->word1.length()-word2.length())
			  .orElse("");
		
		System.out.println("Longest word : "+longestWord);
		System.out.println("Length : "+longestWord.length());
	}

}
