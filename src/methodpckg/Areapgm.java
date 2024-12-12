package methodpckg;

import java.util.Scanner;

public class Areapgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Areapgm obj=new Areapgm();
		Scanner sc=new Scanner(System.in);
		
		 obj.square();  //square
	     System.out.println(" Area of rectangle: "+obj.rectangle());//  rectangle
	     
	     
		System.out.println("Enter the base of triangle :");
		double b=sc.nextDouble();
		System.out.println("Enter the height of triangle :");
		double h=sc.nextDouble();
		System.out.println("Area of a triangle "+obj.triangle(b, h));// triangle
		
		System.out.println("Enter the radius of circle"); //   circle
		int r=sc.nextInt();
		obj.circle(r);
		
	    
	}
	
	// with parameter and return type
	public double triangle(double b,double h) {
		double ar= b*h/2;
		return ar;
		
		
	}
	
	//without return type with parameter
	public void circle(double r)
	{
		double c=3.14*r*r;
		System.out.println("Area of circle :"+c);
	}
	
	//without parameter and return type
    public void  square() {
   	 
   	 int a=2;
   	 int area=a*a;
   	 System.out.println("Area of square:"+area);
   	 
    }
	public double rectangle() { //without parameter and with return type
		int b=4,h=2;
		int c=b*h;
		return c;
	}
	
}
