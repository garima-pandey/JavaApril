package ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) {
		
//		Exception Handling: Abnormal condition which terminates the program flow
		
//		Now use try block - guarded region
		
		System.out.println("DB connection open");
		System.out.println("DB Query");
		
		try {
			
			String path = "C:\\Users\\Garima Pandey\\Documents\\JavaApril\\File1\\abc.txt";
			
			File file = new File(path);
			
			if(file.exists()) {
				System.out.println("Yes file is exist...");
				file.delete();
			}
			else {
				file.createNewFile();
				System.out.println("File Created...");
			}
			
//			String str = null;
//			str.toLowerCase();
//			int arr[] = new int[10];
//			arr[11] = 100; // throw new ArrayIndexOutOfBoundsException()
//			int e = 10 / 0; // throw new ArithmeticException()
		}
		catch(ArithmeticException e) {
//			System.out.println("You Divide a number with zero");
			System.err.println("You Divide a number with zero "+e);
			return;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("More than Array Bound (Size)");
			return;
		}
		catch(NullPointerException e)
		{
			System.out.println("Value is Null");
			return;
		} 
		catch (IOException e) {
			System.out.println("File can't be  create");
			return;
		}
		
//		catch(Exception e)
//		{
//			System.out.println("Some other problem arise, contact to system admin...");
//		}
		System.out.println("Get the result of Query");
		System.out.println("Print the Result of the Query");
		System.out.println("Close the connection");

	}

}
