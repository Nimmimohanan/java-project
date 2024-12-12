package pckg_array;

import java.util.Scanner;

public class Newclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr=new int[4];
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter the numbers:");
		
		for(int i=0;i<4;i++) {
			
			arr[i]=obj.nextInt();
		
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			sum+=arr[i];
		}
		System.out.println(sum);
		
		
	}

}
