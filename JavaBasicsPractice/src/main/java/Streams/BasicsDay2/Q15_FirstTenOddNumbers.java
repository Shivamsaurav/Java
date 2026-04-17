package Streams.BasicsDay2;

import java.util.stream.Stream;

public class Q15_FirstTenOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream.iterate(new int[] {1,3}, f -> new int[] {f[1], f[1]+2})
		 	  .limit(10)
		 	  .map(f -> f[0])
		 	  .forEach(System.out::println);

	}

}
