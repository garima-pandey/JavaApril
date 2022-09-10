package OOPS;

class A {
	int x;
	
	A()
	{
		System.out.println("A default cons call");
	}
	A(int x)
	{
		this();
		this.x = x;
		System.out.println("A Param cons call "+x);
	}
}

class B extends A {
	int y;
	
	B()
	{	
		this(10);
//		super(20);
		System.out.println("B default cons call");
	}
	B(int y)
	{
		super(20);
		this.y = y;
		System.out.println("B Param cons call "+y);
	}
}

public class SupervsThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj = new B();
		
	}

}
