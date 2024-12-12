package pckg_array;

import java.util.Scanner;

public class Sc_namearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr=new int[4];
		System.out.println("Enter the numbers:");
		Scanner sc=new Scanner(System.in);
	
		
		for(int i=0;i<4;i++) {
			arr[i]=sc.nextInt();
			System.out.println(arr[i]);
		}
		
		
		  for(int i=0;i<4;i++)
		  { 
			  
			  System.out.println(arr[i]); 
		  }
		 
			
		

	}

}
