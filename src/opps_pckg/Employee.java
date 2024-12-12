package opps_pckg;

public class Employee {
	//instant variable
	int emp_id;
	String emp_nm;
	String emp_desgn;

	public static void main(String[] args) {
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		
		System.out.println(emp1.emp_id = 101);
		System.out.println(emp1.emp_nm="Anu");
		System.out.println(emp1.emp_desgn="Test engineer");
		
		System.out.println(emp2.emp_id=102);
		System.out.println(emp2.emp_nm="Sinu");
		System.out.println(emp2.emp_desgn="Developer");
		
		System.out.println(emp3.emp_id=103);
		System.out.println(emp3.emp_nm="Neeraj");
		System.out.println(emp3.emp_desgn="Developer");
		
		Accessmodifiers obj=new Accessmodifiers();
		obj.b=10;
		
		
		

	}

}
