package opps_pckg;


class Member1{
	
	String name;
	int age;
	int phnno;
	String address;
	int salary;
	
	
	
	public void printdetails() {
		
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Contact number :"+phnno);
		System.out.println("Address :"+address);
		System.out.println("salary :"+salary);
		
	}
}

class Employee1 extends Member1{
	
	String department;
}
class Manager1 extends Member1{
	String specialization;
	
}


public class Mmbr_heirachicalinheritance {

	public static void main(String[] args) {
		 
		Employee1 e1=new Employee1();
		System.out.println("Employee details");
		e1.name="nimmi";
		e1.age=24;
		e1.phnno=23456789;
		e1.address="kochi";
		e1.salary=25000;
		e1.printdetails();
		System.out.println(e1.department="Testing");
	
		System.out.println();
		Manager1 m=new Manager1();
		System.out.println("Manager details");
		m.name="anu";
		m.age=25;
		m.phnno=23456789;
		m.address="kochi";
		m.salary=26000;
		m.printdetails();
		System.out.println(m.specialization="Software tester");
		
		
		
	}

}
