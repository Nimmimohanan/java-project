package taskpckg;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
		int i;
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	    int	num1=num/2; // 14/2=7  13/2=6
	    if(num==0||num==1) 
	    {
	    	System.out.println(num+" is not a prime number");
	    }
	    else {
	    for(i=2;i<=num1;i++) { //2<=7
	    	if(num%i==0) //14%2=0
	    		
	    	{
	    		System.out.println(num+" is not a prime number");
	    		break;
	    	}
	    	
	    }
	    if(num%i!=0) {
	    	System.out.println(num+" is a prime number");
	    }
	    
	    }
	}

}
