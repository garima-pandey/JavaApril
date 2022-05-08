package Basics;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Choice");
		String choice = sc.nextLine();
		
		switch(choice)
		{
		case "one":
			
			System.out.println("One");
			break;
			
		case "two":
			System.out.println("Two");
			break;
			
		default:
			System.out.println("No Match");
		}

	}

}
