package constructorpckg;

public class Emp_dtls {

	
	int emp_id;
	String emp_nm;
	
	
	
	public Emp_dtls(int emp_id,String emp_nm) {
		this.emp_id=emp_id;
		this.emp_nm=emp_nm;
	}
	
	public static void main(String[] args) {
		
		Emp_dtls obj=new Emp_dtls(001, "nimmi");
		//System.out.println(obj.emp_id);
		//System.out.println(obj.emp_nm);
		obj.display();
		
	
		

	}
	
	public void display() {
		
		System.out.println(emp_id);
		System.out.println(emp_nm);
	}
		
	

}
