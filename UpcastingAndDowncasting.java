package OOPS;

class Parent {
	
	String name;
	
	Parent()
	{
		name = "Rushil";
	}
	
	void show()
	{
		System.out.println("Parent Class");
	}
}

class Child extends Parent {
	
	int number;
	
	Child()
	{
		number = 100;
	}
	
	@Override
	void show()
	{
		System.out.println("Child Class");
	}
	
}

public class UpcastingAndDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//upcasting
//		Parent p = new Child();
//		System.out.println(p.name);
//		p.show();
		
		//Child c = new Parent(); // compile time error
		
		//downcasting explicitily
		Parent p = new Child();
		Child c = (Child)p;
		
		System.out.println(c.name);
		System.out.println(c.number);
		c.show();
		
	}

}
