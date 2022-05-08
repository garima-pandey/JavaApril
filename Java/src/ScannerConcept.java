package Basics;

import java.util.Scanner;

public class ScannerConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name = sc.nextLine();
		
		System.out.println("Enter Age");
		int age = sc.nextInt();
		
		System.out.println("Enter Mobile Number");
		long mobileNo = sc.nextLong();
		
		System.out.println("Enter CGPA");
		double cgpa = sc.nextDouble();
		
		System.out.println("Enter Gender");
		char gender = sc.next().charAt(0);
		
		System.out.println("Name "+name);
		System.out.println("Age "+age);
		System.out.println("Mobile Number "+mobileNo);
		System.out.println("CGPA "+cgpa);
		System.out.println("Gender "+gender);

	}

}
