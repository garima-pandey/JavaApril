package OOPS;

class Person { // Parent Class
	private String name;
	
	public Person()
	{
		name = "Rushil";
	}
	
	public void printName()
	{
		System.out.println("Name of the person is: "+name);
	}
	
	public void contNumber()
	{
		System.out.println("Contact number of the person");
	}
}

class StudentChild extends Person { // extends: inheritance
	
	private int id;
	
	public StudentChild()
	{
		id = 101;
	}
	
	public void printId()
	{
		System.out.println("Id of the Student is: "+id);
	}
	
	@Override
	public void contNumber()
	{
		System.out.println("Contact number of the student");
	}
}

public class ISADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentChild student = new StudentChild(); 
		student.printName();
		student.printId();
		
	}

}
