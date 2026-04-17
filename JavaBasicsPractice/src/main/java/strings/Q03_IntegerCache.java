package strings;

public class Q03_IntegerCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a = 127;
		Integer b = 127;
		System.out.println(a == b); // true

		Integer x = 128;
		Integer y = 128;
		System.out.println(x == y); // false
		
		/*
		 * Java caches Integer objects in the range -128 to 127. 
		 * Within this range, == works because both variables point to the same cached object. 
		 * Beyond 127, new objects are created on the heap, and == compares references — not values.
		 */
	}

}
