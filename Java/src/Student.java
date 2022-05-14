package OOPS;

public class Student {
	
	int rollno;
	String name;
	String phone;
	String course;
	double fees;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ram = new Student();
//		ram = reference variable
		//int x;

		System.out.println("rollno: "+ram.rollno);
		System.out.println("name: "+ram.name);
		System.out.println("phone: "+ram.phone);
		System.out.println("course: "+ram.course);
		System.out.println("fees: "+ram.fees);
		
		ram.rollno = 101;
		ram.name = "Ram";
		ram.phone = "169873679871";
		ram.course = "Btech";
		ram.fees = 10000;
		
		System.out.println("*************************************");
		
		System.out.println("rollno: "+ram.rollno);
		System.out.println("name: "+ram.name);
		System.out.println("phone: "+ram.phone);
		System.out.println("course: "+ram.course);
		System.out.println("fees: "+ram.fees);
		
	}

}
