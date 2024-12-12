package oopsploymorphism;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading m=new Methodoverloading();
		m.add();
		m.add(20, 20);
		m.add(10, 10.5);
		m.add(12.5, 10);
		

	}
	
	public void add() {
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b) {
	int	c=a+b;
	System.out.println(c);
		
	}
	
	public void add(int a,double b) {
		double c=a+b;
		System.out.println(c);
	}
	
	public void add(double a,int b) {
		double c=a+b;
		System.out.println(c);
	}

}
