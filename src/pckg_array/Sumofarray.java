package pckg_array;

import java.util.Scanner;

public class Sumofarray {

	public static void main(String[] args) {
	

		int[] arr=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values:");
		
		for(int i=0;i<4;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			 sum += arr[i];
			
		}
		
		int avg=sum/arr.length;
		System.out.println("sum of numbers: "+ sum);
		
		
		System.out.println("average of numbers: "+ avg);
	}

}
