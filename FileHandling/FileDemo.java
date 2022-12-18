package FileHandling;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

class MyFilter implements FilenameFilter {

	@Override
	public boolean accept(File dirPath, String fileName) {
		// TODO Auto-generated method stub
		return fileName.endsWith(".mp3");
	}
	
}

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
		
		
		path = "C:\\Users\\Garima Pandey\\Documents\\JavaApril\\File\\songs";
		file = new File(path);
//		file.mkdir();
		
		MyFilter filter = new MyFilter();
		System.out.println(filter);
		
		File files[] = file.listFiles(filter);
		
		System.out.println(files[0].getName());
		
		System.out.println("No of Files: "+files.length);
		
		
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
