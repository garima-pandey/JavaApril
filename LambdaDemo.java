package OOPS;

interface Addable {
	int add(int a, int b);
}

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Addable sum = (a, b) -> (a + b);
		Addable sum = (int a, int b) -> (a + b);
		System.out.println(sum.add(100, 200));
		
	}

}
