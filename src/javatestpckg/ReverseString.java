package javatestpckg;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		String rev = "";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		
		String  s= sc.next(); //nimmi
		for(int i=s.length()-1;i>=0;i--) {
			
			rev+=s.charAt(i);
			//System.out.println(rev);
			
		}
		System.out.println(rev);

	}

}
