package taskpckg;

import java.util.Scanner;

public class ArrayLargestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println( "Enter The number of elements:");
		int n=sc.nextInt();
		System.out.println( "Enter The  elements:");
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int largest=arr[0];
		
		for(int i=0;i<n;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			
			
		}
		System.out.println("Largest element in the array:"+largest);
		

	}

}
