package oopsexception;

public class OutOfBoundexception {

	public static void main(String[] args) {
		
		
	//	FileInputStream fv=new FileInputStream
		try {
			
			int[] a=new int[2];
			a[0]=2;
			a[1]=4;
			a[2]=6;
			
			
			
			
		}
		catch(Exception e){
			System.out.println("error message:"+e);
			
		}
		System.out.println("Test exception");

	}

}
