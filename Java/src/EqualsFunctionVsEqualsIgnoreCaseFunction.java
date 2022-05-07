package Basics;

public class EqualsFunctionVsEqualsIgnoreCaseFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "hello";
		String s2 = "Hello";
		
		if(s1.equals(s2))
		{
			System.out.println("Equals: Both the Strings are same");
		}
		else {
			System.out.println("Eqauls: Not Same Strings");
		}
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Ignore: Both the Strings are same");
		}
		else {
			System.out.println("Ignore: Not Same Strins");
		}
	}
}
