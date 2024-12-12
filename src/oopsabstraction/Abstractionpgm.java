package oopsabstraction;



abstract class Cars{       //abstract class
	
	 public abstract void engine() ; //abstract method
	
	public void acceleration() {         //regular method
		System.out.println("Car Details");
	}
	
}

class Bmw extends Cars{       //through inheritance 

	@Override
	public void engine() {
		System.out.println("BMW Engine Details");
		
	}
	
}

class Swift extends Cars {

	@Override
	public void engine() {
		System.out.println("Swift Details");
		
	}
	
}

public class Abstractionpgm {

	public static void main(String[] args) {
		Bmw b=new Bmw();
		b.acceleration();
		b.engine();
		System.out.println();
		Swift s=new Swift();
		s.acceleration();
		s.engine();

	}

}
