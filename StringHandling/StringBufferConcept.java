package StringHandling;

public class StringBufferConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity() + " "+ sb.length());
		sb.append("Hello");
		System.out.println(sb.capacity() + " "+ sb.length());
		sb.append("How are you I am fine iuehiufhwehfoihweoihfoioihoirheoihw");
		System.out.println(sb.capacity() + " "+ sb.length());
	}

}
