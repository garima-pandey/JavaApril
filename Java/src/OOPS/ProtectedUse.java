package OOPS;

class Vehicle {
	protected String type = "4 Wheeler";
}

class Car extends Vehicle {
	public void print()
	{
		System.out.println(type);
	}
}

public class ProtectedUse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.print();
	}

}
