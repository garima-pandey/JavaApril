package StringHandling;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String Literal Style: 1 or 0
		
		String name = "Ram";
		String name2 = "Ram";
		
		// String Object Style: 
//		String name3 = new String("Rushil").intern();
//		String name4 = new String("Rushil").intern();
		
//		System.out.println(name);
		System.out.println(name == name2);
//		System.out.println(name == name3);
//		System.out.println(name3 == name4);
		
		String str1 = "Hello";
		String str2 = str1;
		System.out.println(str1 == str2);
		str1 = str1 + "How are you";
		System.out.println(str1 == str2);
	}

}
