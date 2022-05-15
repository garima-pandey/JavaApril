package OOPS;

public class Student {
	
//	data members/ class variables / instance variables
	//Data Hiding - Security
	private int rollno; //private member variables
	private String name;
	private String phone;
	private String course;
	private double fees;
	
//	r, n, p, c, f  are local variables
//	public void takeInput(int r, String n, String p, String c, double f)
	public void takeInput(int rollno, String name, String phone, 
			String course, double fees)
	{
		
		this.rollno = rollno;
		this.name = name;
		this.phone = phone;
		this.course = course;
		this.fees = fees;
		
//		instance variables = local variables
//		rollno = r;
//		name = n;
//		phone = p;
//		course = c;
//		fees = f;
	}
	
	public void print()
	{
		System.out.println("rollno: "+this.rollno);
		System.out.println("name: "+name);
		System.out.println("phone: "+phone);
		System.out.println("course: "+course);
		System.out.println("fees: "+fees);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ram = new Student();
//		ram = reference variable
		//int x;
		ram.takeInput(101, "Ram", "8146864876", "Btech", 10000);
		ram.print();

//		System.out.println("rollno: "+ram.rollno);
//		System.out.println("name: "+ram.name);
//		System.out.println("phone: "+ram.phone);
//		System.out.println("course: "+ram.course);
//		System.out.println("fees: "+ram.fees);
		
//		ram.rollno = 101;
//		ram.name = "Ram";
//		ram.phone = "169873679871";
//		ram.course = "Btech";
//		ram.fees = 10000;
		
//		System.out.println("*************************************");
		
		
//		ram.print();
		
//		System.out.println("rollno: "+ram.rollno);
//		System.out.println("name: "+ram.name);
//		System.out.println("phone: "+ram.phone);
//		System.out.println("course: "+ram.course);
//		System.out.println("fees: "+ram.fees);
		
	}

}
