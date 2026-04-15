package Streams.BasicsDay1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Q09_MergeTwoUnsortedArraysInSingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {4, 2, 7, 1};
        
        int[] b = new int[] {8, 3, 9, 5};
        
        int[] result = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
        		 				.sorted()
        		 				.toArray();
        System.out.println(Arrays.toString(result));

	}

}
