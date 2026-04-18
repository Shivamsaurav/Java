package miscellaneous;

public class Q02_FinallyBlockFailure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Inside try");
			System.exit(0);
		} 
		finally {
			System.out.println("Finally executed");
		}
		
		/*\
		 * Finally executed” never prints. 
		 * System.exit() shuts down the JVM before finally gets a chance to run. 
		 */
	}
}
