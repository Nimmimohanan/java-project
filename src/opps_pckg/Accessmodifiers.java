package opps_pckg;

public class Accessmodifiers extends AccessM1 {
	
	public static void main(String[] args) {
		
		Accessmodifiers obj=new Accessmodifiers();
		obj.a=10;
		obj.b=20;
		obj.k=110;
		obj.msg(); //public from other package
	}
	
	private int a; //private with in the class only
	int b;             //default with in the class 
	protected int k; //protected with in the class 
	public int c;
	
	
	
}
