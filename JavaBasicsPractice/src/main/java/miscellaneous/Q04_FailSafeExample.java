package miscellaneous;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Q04_FailSafeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
		
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
