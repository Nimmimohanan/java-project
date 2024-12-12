package decision_statements;

import java.util.Scanner;

public class Nestedif2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age:");
		int age=sc.nextInt();
		if(age>=18) {
			
			System.out.println("your an adult");
			
			if(age>=21) {
				System.out.println("your are eligible for marriage");
			}
			else if(age<=21) {
				System.out.println("your not elibile for marriage");
			}
		}
		
		
		else 
		{
			System.out.println("Your minor");
			
			if(age>=16) {
				System.out.println("your are eligible for drive in some countries");
			}
			else {
				System.out.println("your are not eligible for drive in India");
			}
		}

	}

}
