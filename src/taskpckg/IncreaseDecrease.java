package taskpckg;

import java.util.Scanner;

public class IncreaseDecrease {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if((a>b && b>c)) {
			
				System.out.println("decreasing order");
			}
			else if((a<b && b<c)){
				
					System.out.println("Increasing  order");
				
			}
			else {
				System.out.println("Neither increasing nor decresing  ");
			}
			
		}
		

	}


