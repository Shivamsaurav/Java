package Streams.BasicsDay1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Q10_MergeTwoUnsortedArraysInSingleArrayWithoutDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[] {4, 2, 5, 1};
        
        int[] b = new int[] {8, 1, 9, 5};
        
        int[] result = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
        		 				.sorted()
        		 				.distinct()
        		 				.toArray();
        System.out.println(Arrays.toString(result));
	}

}
