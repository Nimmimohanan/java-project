package oopsploymorphism;

class Parent{
	public void job() {
		System.out.println("Engineer");
	}
	public void mobile() {
		System.out.println("Samsung");
		
	}
}

class Child extends Parent{
	public void job() {
		super.job();
		System.out.println("Doctor");
	}
	public void mobile() {
		System.out.println("Iphone");
		super.mobile();
	}
}


public class Methodoverriding {

	public static void main(String[] args) {
		Child c= new Child();
		c.job();
		c.mobile();

	}

}
