package constructorpckg;

public class Car_dtls {

	String color;
	String name;
	
	public Car_dtls(String color,String name){
		this.color=color;
		this.name=name;
		
	}
	
	public static void main(String[] args) {
		
		Car_dtls obj=new Car_dtls("Red", "BMW");
		//obj.display();
		System.out.println("The car name:"+obj.color);
		System.out.println("The car colour:"+obj.name);
		

	}
	
	/*
	 * public void display() { System.out.println("The car name:"+name);
	 * System.out.println("The car colour:"+color); }
	 */

}
