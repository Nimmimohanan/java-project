package methodpckg;

public class MethodPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodPgm obj=new MethodPgm();
		obj.add();
		System.out.println("subtraction : "+obj.sub());
		obj.mul(25, 5);
		int s=obj.div(150, 10);
		System.out.println("division :"+s);
		

	}
	
	//Method without return type and without parameters add()
	
	public void add() {
		int a=20,b=10,c;
		c=a+b;
		System.out.println(" addition : "+c);
	}
	
	//Method with return type and without parameters sub()
	
	public int sub() {
		int a=50,b=2,c;
		c=a-b;
		return c;
	}
	
	//Method without return type and with parameters  
	
	public void mul(int a,int b) {
		int c= a*b;
		System.out.println("multiplication "+c);
		
	}
	
	//Method with return type and with parameters 
	public int div(int a,int b) {
		int c=a/b;
		return c;
		
	}

}
