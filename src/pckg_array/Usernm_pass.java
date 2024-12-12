package pckg_array;

import java.util.Scanner;

public class Usernm_pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] str=new String[2][2];
		Scanner obj=new Scanner(System.in);
		
	  System.out.println("Enter the user name and password:");  
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				str[i][j]=obj.next();
			}
		}
		
		System.out.println("The details are:");
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(str[i][j]+" ");
			}
		}
		

	}

}
