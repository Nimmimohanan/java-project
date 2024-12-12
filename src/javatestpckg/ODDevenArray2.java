package javatestpckg;

import java.util.Scanner;

public class ODDevenArray2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of  array elements:");
		int n=sc.nextInt();
		int []ar=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<=n-1;i++) {
			ar[i]=sc.nextInt();
		}
		
		
		System.out.println(" odd  numbers:");
		
		
		for(int i=0;i<n;i++) {
			
			if(ar[i]%2!=0) {
				System.out.println(ar[i]);
				
			}
		}
		
		System.out.println(" even elements:");
		for(int i=0;i<n;i++) {
			if(ar[i]%2==0) {
				
				System.out.println(ar[i]);
				
			}
			
		}

	}

}
