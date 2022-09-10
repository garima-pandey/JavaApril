package OOPS;

class _Person {
private String name;
	
	public _Person()
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

class Employee extends Person {
	private int salary;
	
	public Employee() {
		super();
		this.salary = 50000;
	}
	
	public void printSalary()
	{
		System.out.println("Employee Salary is: "+salary);
	}
	@Override
	public void contNumber()
	{	super.contNumber();
		System.out.println("Contact number of the employee");
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e.printName();
		e.printSalary();
		e.contNumber();

	}

}
