package decision_statements;

import java.util.Scanner;

public class ODDEven2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int number=sc.nextInt();
		if(number%2==0) {
			System.out.println("The number even");
			
			
		}
		else {
			System.out.println("The number odd");
			
		}

	}

}