package strings;

public class Q02_SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "java";
		String s = str.substring(0);
		
		System.out.println(str == s); // true or false
		
		/*
		 * It prints true. When substring(0) covers the entire string, 
		 * Java is smart enough to return the same reference instead of creating a new object. 
		 * The optimization many developers don’t expect.
		 */
	}

}
