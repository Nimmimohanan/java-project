package taskpckg;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping");
		System.out.println("Enter first number:"+a);
		System.out.println("Enter second number:"+b);
		
		

	}

}
