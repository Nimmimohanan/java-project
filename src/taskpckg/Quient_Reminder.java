package taskpckg;

import java.util.Scanner;

public class Quient_Reminder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a divident:");
        int a=sc.nextInt();
        System.out.println("Enter a divisor:");
        int b=sc.nextInt();
        int quotient=a/b;
        int reminder=a%b;
        System.out.println("The Quotient:"+quotient);
        System.out.println("The reminder:"+reminder);
        
        
        
        
        
        
        
        
        
	}

}
