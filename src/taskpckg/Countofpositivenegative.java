package taskpckg;

import java.util.Scanner;

public class Countofpositivenegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of elements:");
		int n1=sc.nextInt();
		System.out.println("Enter the numbers:");
		int[] n =new int[n1] ;
		for(int i=0;i<n1;i++) {
			 n[i]=sc.nextInt();
		}
		int postive=0;
		int negative=0;
		int zero=0;
		for(int num:n) {
			if(num>0) {
				postive++;
			}
			else if(num<0) {
				negative++;
			}
			else {
				zero++;
				
			}
		}
		System.out.println("Positive number count:"+postive);
		System.out.println("Negative number count:"+negative);
		System.out.println("Zero number count:"+zero);
		

	}

}
