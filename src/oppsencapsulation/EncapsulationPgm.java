package oppsencapsulation;



class EmpNew{
	
	private String emp_nm;
	private String emp_designation;
	private int emp_id;
	/**
	 * @return the emp_nm
	 */
	public String getEmp_nm() {
		return emp_nm;
	}
	/**
	 * @param emp_nm the emp_nm to set
	 */
	public void setEmp_nm(String emp_nm) {
		this.emp_nm = emp_nm;
	}
	/**
	 * @return the emp_designation
	 */
	public String getEmp_designation() {
		return emp_designation;
	}
	/**
	 * @param emp_designation the emp_designation to set
	 */
	public void setEmp_designation(String emp_designation) {
		this.emp_designation = emp_designation;
	}
	/**
	 * @return the emp_id
	 */
	public int getEmp_id() {
		return emp_id;
	}
	/**
	 * @param emp_id the emp_id to set
	 */
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
}

public class EncapsulationPgm {

	public static void main(String[] args) {
		EmpNew e=new EmpNew();
		e.setEmp_nm("Nimmi");
		e.setEmp_designation("developer");
		e.setEmp_id(391581);
		
		System.out.println("Employee Details");
		
		System.out.println(e.getEmp_id());
		System.out.println(e.getEmp_nm());
		System.out.println(e.getEmp_designation());
		

	}

}
