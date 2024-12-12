package opps_pckg;

import java.util.Scanner;

public class Simple_calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter the operation:");
	    String op=sc.next();
	    int operation=0;
		switch(op) {
		     case "+":
		    	 
		    	 operation=a+b;
		    	 break;
		    	 
		     case "-":
		    	operation=a-b;
		    	 break;
		    	 
		     case "*":
		    	 operation=a*b;
		    	 break;
		    	 
		     case "/":
		    	operation=a/b;
		    	 break;
		    	 
		     case "%":
		    	 operation=a%b;
		    	 break;
		    	 
		    	 default:
		          System.out.println("invalid operation");
		    		 
		}
		System.out.println(a +" "+ op +" "+b+" = "+ operation);
		

	}

}
