package Basics;

import java.util.Scanner;

public class ArraySyntax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a[];
		int arr[] = {1, 2, 3, 4, 5};
		
		//int lists[][] = new int[5][4];
		int lists[] = new int[5];
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Enter values in lists array");
		for(int i = 0; i < lists.length; i++)
		{
			lists[i] = sc.nextInt();
		}
		
		for(int i : lists)
		{
			System.out.println(i);
		}
	}
}
