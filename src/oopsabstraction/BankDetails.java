package oopsabstraction;

import java.util.Scanner;

interface bankdtls{
	
	public void Accountdetails();
	public void balance();
	public void withdrawal();
	public void deposit();
}

class  Bank1 implements bankdtls{
	
	
	int bamount=200000;
	static String bankname="SBI";
	
	Scanner sc=new Scanner(System.in);

	@Override
	public void Accountdetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the account number:");
		String ac=sc.next();
		System.out.println("Enetr the account holder name:");
		String nm=sc.next();
		System.out.println("Enter branch name:");
		String br=sc.next();
		System.out.println("Account Details");
		System.out.println("account number:"+ac);
		System.out.println("account holder name:"+nm);
		System.out.println("bank  name:"+bankname);
		System.out.println("branch name:"+br);
		
		
	}

	@Override
	public void balance() {
		 
		System.out.println("The final balance is:"+bamount);
		
	}

	@Override
	public void withdrawal() {
		
		System.out.println("Enetr the amount to withdraw:");
		int wamnt=sc.nextInt();
		bamount= bamount-wamnt;
		System.out.println("Balance amount:"+bamount);
		
		
	}

	@Override
	public void deposit() {
		System.out.println("Enter the amount to deposit:");
		int depositamnt=sc.nextInt();
		 bamount=bamount+depositamnt;
		System.out.println("Current balance:"+bamount);
		
		
		
		
	}
	
	
}

public class BankDetails {

	public static void main(String[] args) {
		Bank1 bb=new Bank1();
		bb.Accountdetails();
		bb.balance();
		bb.withdrawal();
		bb.deposit();

	}

}
