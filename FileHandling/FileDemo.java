package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path = "C:\\Users\\Garima Pandey\\Documents\\JavaApril\\File\\sample.txt";
		
		File file = new File(path);
		
		if(file.exists())
		{
			File file2 = new File("C:\\Users\\Garima Pandey\\Documents\\JavaApril\\File\\samplecopy.txt");
			file.renameTo(file2);
//			file.delete();
//			System.out.println("File Deleted");
		}
		else {
			file.createNewFile();
			System.out.println("File Created");
		}
		
//		path = "C:\\Users\\Garima Pandey\\Documents\\JavaApril\\File\\example";
//		file = new File(path);
//		file.mkdir();
		
//		path = "C:\\Users\\Garima Pandey\\Documents\\JavaApril\\File\\aa\\bb\\cc";
//		
//		file = new File(path);
//		
//		file.mkdirs();
	}

}
