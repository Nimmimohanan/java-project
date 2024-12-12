package taskpckg;

import java.util.Scanner;

public class Sum_of_numbers {

	public static void main(String[] args) {
		int a,b,sum;
		int opt ;
          
          do {
        	  System.out.println("Enter two numbers:");
        	  Scanner obj=new Scanner(System.in);
              a=obj.nextInt();
              b=obj.nextInt();
              sum =a+b;
        	  
        	  System.out.println("Sum of the two numbers:"+sum);
        	  
        	  System.out.println("Do u want to perform the operation again then enter 1 ?");
        	  opt=obj.nextInt();
          }while(opt ==1);
         System.out.println("Thankyou");
          
	}

}
