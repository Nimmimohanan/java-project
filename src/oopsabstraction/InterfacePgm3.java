package oopsabstraction;



interface vehicle{
	void start();
	void stop();
	
}
class Car implements vehicle{

	@Override
	public void start() {
		System.out.println("car is starting");
		
	}

	@Override
	public void stop() {
		System.out.println("car is stop");
		
	}
	
}
class Bike implements vehicle{

	@Override
	public void start() {
		System.out.println("Bike is starting");
		
	}

	@Override
	public void stop() {
		System.out.println("Bike is stop");
		
	}
	
}



public class InterfacePgm3 {

	public static void main(String[] args) {
		Car c=new Car();
		Bike b=new Bike();
		c.start();
		c.stop();
		b.start();
		b.stop();

	}

}
