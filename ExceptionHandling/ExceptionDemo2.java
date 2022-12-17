package ExceptionHandling;

public class ExceptionDemo2 {
	
	static void db() throws ArithmeticException{
		System.out.println("Connection Open");
		try {
			int e = 100 / 0;
			System.out.println("Query and Get result of the Query");
			System.out.println("Send result to Helper");
		}
		finally { // finally is a block which always execute
			System.out.println("Connection Close");
		}
	}
	
	static void helper() throws ArithmeticException{
		System.out.println("Call the DB");
		db();
		System.out.println("Get result from DB");
		System.out.println("Send result to View");
	}
	
	static void view()
	{
		System.out.println(("Call the Helper"));
		try {
			helper();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by Zero");
			return;
		}
		System.out.println("Get result from the Helper");
		System.out.println("Print result to User");
	}
	
	public static void main(String[] args) {
		view();

	}

}
