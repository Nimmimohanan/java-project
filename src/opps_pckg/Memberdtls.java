package opps_pckg;

import java.util.Scanner;  

class Member{
	String name;
	int age;
	String phonenumber;
	String address;
	int salary;
	
	public void printDtls() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Name:");
		this.name=sc.next();
		System.out.println("enter the Age:");
		this.age=sc.nextInt();
		System.out.println("enter the phoneno:");
		this.phonenumber=sc.next();
		System.out.println("enter the Addres:");
		this.address=sc.next();
		System.out.println("enter the salary:");
		this.salary=sc.nextInt();
		System.out.println("name:"+name);
		System.out.println("Age:"+age);
		System.out.println("phone number:"+phonenumber);
		System.out.println("address:"+address);
		System.out.println("salary:"+salary);
		
	}
		
}


  class Emp extends Member{
	  public void empDtls()
	  {
		  Scanner sc=new Scanner(System.in);
			/*
			 * System.out.println("Specialisation:"); String spec=sc.next();
			 */
    		System.out.println("Enter the Department:");
    		String depart=sc.next();
    		System.out.println("Department:"+depart);
    		//System.out.println("Department:"+depart);
             
       } 
	 }
 

class Manager extends Member{
	public void MngrDtls () {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Specialisation:"); 
		String spec=sc.next();
		
	//	System.out.println("specification:"+spec);
		System.out.println("Specialisation:"+spec);

		
	}
}
public class Memberdtls {

	public static void main(String[] args) {
		
		System.out.println("Manager details");
		Manager m=new Manager();
		m.printDtls();
		m.MngrDtls();
		
		System.out.println();
		
		System.out.println("Employee details");
		Emp e=new Emp();
		e.printDtls();
		e.empDtls();
		
		
		
		
		

	}

}
