package oopsabstraction;



interface in1{
	void test1();
	void test2();
}

interface in2 extends in1{
	void test3();
	void test4();
	
	
}


class clz1 implements in2{

	@Override
	public void test1() {
		System.out.println("Test1 details");
		
	}

	@Override
	public void test2() {
		System.out.println("Test2 details");
		
	}

	@Override
	public void test3() {
		System.out.println("Test3 details");
		
	}

	@Override
	public void test4() {
		System.out.println("Test4 details");
		
	}
	
}

public class InterfacePgm4 {

	public static void main(String[] args) {
		clz1 c=new clz1();
		c.test1();
		c.test2();
		c.test3();
		c.test4();

	}

}
