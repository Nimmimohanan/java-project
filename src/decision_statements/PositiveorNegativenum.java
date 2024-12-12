package decision_statements;

import java.util.Scanner;

public class PositiveorNegativenum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("The number  "+a+" is positive");
			
		}
		else if(a<0) {
			System.out.println("The number "+a+" is Negative");
		}
		else {
			System.out.println("The  number "+a+" is Zero");
			
		}
		

	}

}
