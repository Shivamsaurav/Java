package Streams.TrickyDay1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q01_FlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> listOfLists = Arrays.asList(
													Arrays.asList(1, 2, 3),
													Arrays.asList(4, 5),
													Arrays.asList(6, 7, 8, 9)
													);
		
		List<Integer> result = listOfLists.stream()
				    					  .flatMap(list->list.stream())
				    					  .collect(Collectors.toList());
			
		System.out.println(result);
		
	}

}
