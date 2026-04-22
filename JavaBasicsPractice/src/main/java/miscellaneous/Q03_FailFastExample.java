package miscellaneous;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q03_FailFastExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap<String, String>();
		
		map.put("New Delhi", "India");
		map.put("Moscow", "Russia");
		map.put("New York", "USA");
		
		Iterator<String> iterator = map.keySet().iterator();
		
		while (iterator.hasNext()) {
			System.out.println(map.get(iterator.next()));
			
			map.put("Istanbul", "Turkey");
			
		}
	}

}
