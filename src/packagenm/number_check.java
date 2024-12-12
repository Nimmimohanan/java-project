package packagenm;

public class number_check {

	public static void main(String[] args) {
	//1
    int a=23,b=45;
	System.out.println("   a==b  " + (a==b));
	
	//2
	int aa=55,bb=70;
	System.out.println("aa<50  "+(aa<50));
	System.out.println("aa<bb  "+(aa<bb));
	
	//3
	int x=20,y=30;
	System.out.println("Values of x : "+ x );
	System.out.println("Values of y : "+ y );

	x=x+y;
    y=x-y;
    x=x-y;
	
     System.out.println("Value of x : "+x);
	 System.out.println("Value of y : "+y);
	
	 //4
	 
	 int a1=17;
	 System.out.println("Second digit of a1 :"+(a1%10));
	 
	

	}

}
