package taskpckg;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		String rev = " ";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		String s=sc.nextLine();
		
		String [] str=s.split(" ");
		
		  for (int i=str.length-1;i>=0;i--) {
		  
		       rev +=str[i]+" ";
		  }
		  
		  System.out.println("Reversed Sentence: " + rev);
		  
		  }

	
}
