package OOPS;

public class FinalizeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Finalize is used to perform clean up processing just before 
//		object is garbage collected.
		
		FinalizeMethod obj = new FinalizeMethod();
		obj = null; //unused

		System.gc(); //requesting JVM to call Gargabe Collecter Method
		System.out.println("Main Coimpletes");
	}
	
	//overrind the finalize method
	public void finalize()
	{
		System.out.println("Finalize method overridden");
	}

}
