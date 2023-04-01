package StringHandling;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String name = "  Rushil   ";
		String name = "Rushilsyttoe";
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.substring(1, 3));
//		1 - index - (0)
//		3 - position - (1)
		System.out.println(name.trim());
		System.out.println(name.replace('s', 'v'));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.concat(" Gupta"));
		System.out.println(name+" Gupta");
		System.out.println(name.contains("hil"));
		System.out.println(name.indexOf("s"));
		System.out.println(name.lastIndexOf("e"));
	}

}
