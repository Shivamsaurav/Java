package Streams.BasicsDay2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Q05_ReverseAnIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {5, 1, 7, 3, 9, 6};
		
		int[] reversedArray = IntStream.rangeClosed(1, array.length)
									   .map(i-> array[array.length-i])
									   .toArray();
		
		System.out.println(Arrays.toString(reversedArray));
	}

}
