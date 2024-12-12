package decision_statements;

import java.util.Scanner;

public class ElseifScan {

	public static void main(String[] args) {

   int a,b,c;
   
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the 1st number:");
   a=sc.nextInt();
   System.out.println("Enter the 2nd number:");
   b=sc.nextInt();
   System.out.println("Enter the 3rd number:");
   c=sc.nextInt();
   if(a>b&&a>c) {
	   System.out.println("1st number is larger");	   
   }
   else if(b>a&&b>c)
   {
	   System.out.println("2nd number is larger");	   
   }
   else
   {
	   System.out.println("3rd number is larger");
   }
   
	}

}
