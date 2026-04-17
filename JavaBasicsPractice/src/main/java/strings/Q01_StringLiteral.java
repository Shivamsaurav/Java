package strings;

public class Q01_StringLiteral {
	public static void main(String[] args) {
	
		String str1 = "SpringBoot";
		String str2 = "SpringBoot";
		
		String str3 = new String("SpringBoot");
		
		System.out.println(str1 == str2);
		
		System.out.println(str1 == str3);
		
		System.out.println(str1.equals(str3));
	}
}
