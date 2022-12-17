package OOPS;

interface Printable {
	void print();
}

interface Showable {
	void show();
}

class ChildDemo implements Printable, Showable {
	public void print() {
		System.out.println("Hello Print");
	}
	public void show()
	{
		System.out.println("Hello Show");
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Multiple Interface

		ChildDemo obj = new ChildDemo();
		obj.print();
		obj.show();
	}

}
