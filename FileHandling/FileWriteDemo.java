package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the data to be write in a file");
		Scanner sc = new Scanner(System.in);
		
		String txt = sc.nextLine();
		
		FileOutputStream fo = new FileOutputStream("C:\\Users\\Garima Pandey\\Documents\\JavaApril\\File\\sample.txt");
		fo.write(txt.getBytes());
		
		fo.close();
		
		System.out.println("Data write in a file");

	}

}
