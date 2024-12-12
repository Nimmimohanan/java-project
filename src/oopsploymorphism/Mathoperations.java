package oopsploymorphism;

public class Mathoperations {

	public static void main(String[] args) {
		Mathoperations m=new Mathoperations();
		m.multiply(2,6);
		m.multiply(3, 2,6.0);
		m.multiply(4.0,2.0);

	}
public void multiply(int a,int b) {
	int c=a*b;
	System.out.println(c);
	
	
}
public void multiply(int a,int b,double c) {
	double d=a*b*c;
	System.out.println(d);
	
}
public void multiply(double a,double b) {
	double c=a*b;
	System.out.println(c);
}
}
