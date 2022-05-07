package Basics;

public class EqualToOperatorVsEqualsFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String str1 = "HELLO"; // Literal Style
		
		String str1 = new String("HELLO"); // Object Style
		String str2 = new String("HELLO");
		
		System.out.println(str1 == str2); // reference compare
		System.out.println(str1.equals(str2)); // content compare
	}

}
