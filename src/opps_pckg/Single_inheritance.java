package opps_pckg;



class Parent{
	public void pclz()
	{
		System.out.println("parent class details");
	}
}
class Child extends Parent{
	public void childclz() {
		System.out.println("Child class details");
	}
}

public class Single_inheritance {

	public static void main(String[] args) {
		Child obj=new Child();
		obj.childclz();
		obj.pclz();
		
		
	}

}
