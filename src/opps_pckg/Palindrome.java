package opps_pckg;

import java.util.Scanner;

public class Palindrome {
	

	public static void main(String[] args) {
		int rev=0,rem=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int a=num;
		
		while(num!=0){
			
			rem=num%10; 
			rev=rev*10+rem; 
			num=num/10;
		}
		
		if(rev==a)
		{
          System.out.println("number is a palindrome");
		}
		else {
			 System.out.println("not a palindrome");
		}
	}

}
