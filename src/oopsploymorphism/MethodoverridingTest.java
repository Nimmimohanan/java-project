package oopsploymorphism;




class Parentt{
	public void Mp() {
		
		System.out.println("The parent class details");
	}
}


class Ch extends Parentt {
	public void Mp() {
		System.out.println("The child class details:");
		super.Mp();
	}
}
public class MethodoverridingTest {

	public static void main(String[] args) {
		Ch c=new Ch();
		c.Mp();
	}

}
