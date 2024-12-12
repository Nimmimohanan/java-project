package javatestpckg;

import java.util.Scanner;

public class OddEvenArray {

	public static void main(String[] args) {
		
		
	//	System.out.println("Enter the array en")
		int[] n= {5,3,4,6,7};
		
		
		System.out.println("Odd numbers:");
		
		for(int i=0;i<n.length;i++){
		
			
			if(n[i]%2!=0) {
				System.out.println(n[i]);
				
			}
		}
			
			System.out.println("Even number:");
			
			for(int i1=0;i1<n.length;i1++) {
			
				if(n[i1]%2==0) {
				
				System.out.println(+n[i1]);
				
			}
			}
		
			
			
			
		

	}

}
