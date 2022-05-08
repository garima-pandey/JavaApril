package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerConceptNew {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Scanner sc = new Scanner(System.in);
		
		BufferedReader br = new 
				BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter an Integer");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter a String");
		String b = br.readLine();
		
		System.out.println("You have entered "+a+" and "+b);

	}

}
