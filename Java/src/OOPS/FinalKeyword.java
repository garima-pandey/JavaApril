package OOPS;

final class Base {
	public final void method()
	{
		System.out.println("Base Class");
	}
}

class Derived extends Base {
	@Override
	public void method()
	{
		System.out.println("Derived Class");
	}
}

public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int n = 10; //constant variable
		
		//n = 20; // error

	}

}
