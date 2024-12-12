package opps_pckg;


class Animal {
	
	public void eat() {
		System.out.println("The animals can eat");
	}
	
}

class Lion extends Animal{
	public void king() {
		System.out.println("Lion eat meat");
	}
	
}

class Deer extends Animal{
	public void run() {
		System.out.println("deer eat grass");
	}
}

public class Hierarchical_inheritance {

	public static void main(String[] args) {
		
         Lion l=new Lion();
         l.eat();
         l.king();
         Deer d=new Deer();
         d.run();
         d.eat();
	}

}
