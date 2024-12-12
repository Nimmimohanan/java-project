package oopsexception;

public class TestException {

	public static void main(String[] args) {
		
	
	try {
		int a=10,b=0,c;
		c=a/b;
		System.out.println(c);
		
		
		
	}
	catch(Exception ex) {
		System.out.println(ex.getMessage());
	}
	System.out.println("Hai Hello");
	try {
		
		String s=null;
		System.out.println("the string:" +s);
		
	}
	catch(NullPointerException en)
	
	{
		System.out.println("Error occured");
	}
	
	
	}
}
