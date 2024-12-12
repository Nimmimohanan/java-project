package oopsploymorphism;

public class Methodoveload {

	public static void main(String[] args) {
		Methodoveload obj=new Methodoveload();
		obj.show(3);
		obj.show("hai");
		obj.show(100, "java");

	}
	
	public void show(int a) {
		System.out.println("integer method called : "+a);
	}
	public void show (String n) {
	
		System.out.println("String method called: "+n);
	}
	public void show(int a,String name) {
		
		System.out.println("Two parameter called:"+a+" and "+name);
		
		
	}

}
