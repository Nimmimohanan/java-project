package methodpckg;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
        String str=sc.next();
        VowelsCount obj=new VowelsCount();
        int vowelcnt= obj.VowelCount(str);
        System.out.println("the count of vowels in entered string:"+vowelcnt);
        
	}

	
	public int VowelCount(String str) {
		
		int count=0;
		
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);//s.charAt(i)=='a'||s.charAt(i)=='a'
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				count++;
				
			}
		}
			
		
		return count;
		
	}
}
