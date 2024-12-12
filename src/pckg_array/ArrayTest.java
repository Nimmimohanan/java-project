package pckg_array;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		int n=sc.nextInt();
		
		System.out.println("enter the numbers:");
		int [] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<n;i++) {
			
			System.out.println(a[i]);
		}

		
	}

}
