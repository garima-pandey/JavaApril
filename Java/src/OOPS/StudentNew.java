package OOPS;

//class Person {
//	
//}

public class StudentNew {
	
	private int id;
	private double fees;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StudentNew(int id, double fees, String name) {
//		super();
		this.id = id;
		this.fees = fees;
		this.name = name;
	}

	public StudentNew(int id, double fees) {
//		super();
		this(102, 300000, "Ram");
		this.id = id;
		this.fees = fees;
	}

	public void print()
	{
		System.out.println(id +" "+ fees +" "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentNew obj = new StudentNew(101, 10000);
		obj.print();

	}
}
