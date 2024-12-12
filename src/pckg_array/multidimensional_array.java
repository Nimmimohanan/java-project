package pckg_array;

import java.util.Scanner;

public class multidimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr=new int[3][3];
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the values:");
		
		
		  for(int i=0;i<3;i++)
		  { 
			  for(int j=0;j<3;j++) 
			  {
				  System.out.print("Element at [" + i + "][" + j + "]: ");
		        arr[i][j]=obj.nextInt(); 
		       }
			  }
		 
		System.out.println("The Entered array ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
