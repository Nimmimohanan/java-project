package javatestpckg;

import java.util.Scanner;

public class TotalNoOfcharString {

	public static void main(String[] args) {
		
		int cnt=0;
		System.out.println("enter the String:");
		Scanner sc=new Scanner(System.in);
		String  s=sc.next();
		for(int i=0;i<=s.length()-1;i++) {
			
			cnt++;
			
			
		}
		System.out.println("The length of string:"+cnt);
	

	}

}
