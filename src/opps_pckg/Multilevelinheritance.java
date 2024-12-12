

package opps_pckg;


class Bird {
	public void birdMethod() {
		System.out.println("The bird details"); //parent class
	}
	
}
class Hen extends Bird{
	public void henMthd() {
		System.out.println("The hen details");        //intermediate class
		
	}
}

class Chicken extends Hen{
	public void chickenMthd() {
		System.out.println("The chicken details"); // child class
	}
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		Chicken c=new Chicken();
		c.birdMethod();
		c.henMthd();
		c.chickenMthd();

	}

}
