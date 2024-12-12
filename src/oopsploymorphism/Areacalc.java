package oopsploymorphism;

class Areacalc {
	
	public double area(int a) { //circle
		double area=3.14*a*a;
		return area;
		
	}
	
	public double area(double length,double width ) {  //rectangle
		
		double ar=length*width;
		return ar;
		}
	
	public double area(double side) {   //area of square
		double Square=side*side;
		return Square;
		
	}
	

	public static void main(String[] args) {
		
		Areacalc aaa=new Areacalc();
		double ab=aaa.area(4.0);
		System.out.println("Area of square : "+ab);
		double abc=aaa.area(2);
		System.out.println("Area of circle: "+abc);
	    double b=aaa.area(2.0, 3.0);
	    System.out.println("Area of rectangle: "+b);
		
		
	}
	
	
	

}
