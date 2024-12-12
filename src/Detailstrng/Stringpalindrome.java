package Detailstrng;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="";
		int i;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=obj.next();
			  
			  for( i=s.length()-1;i>=0;i--) 
			  {
				 
				  rev=rev+s.charAt(i);
				 
			}
			  if(rev.equalsIgnoreCase(s)) {
				  System.out.println("string is a palindrome");
				  
			  }
			  else {
				  System.out.println("string is  not a palindrome");
				  
			  }
			 
		
		

	}

}
