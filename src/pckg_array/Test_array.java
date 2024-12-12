package pckg_array;

import java.util.Scanner;

public class Test_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] st=new String[5];
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the values:");
		for(int i=0;i<5;i++) {
			
			st[i]=sc.next();
		}
		
		for(int i=0;i<st.length;i++) {
			
			System.out.print(st[i]+" ");
		}
		
		

	}

}
