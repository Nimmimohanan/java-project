package opps_pckg;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
           System.out.println("Enter two numbers");
           Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
    	    int c=a+b;
            System.out.println("sum of two numbers : "+c);
	}

}