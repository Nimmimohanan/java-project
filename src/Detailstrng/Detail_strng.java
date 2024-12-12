package Detailstrng;

public class Detail_strng {

	public static void main(String[] args) {
		
		//concat
		
		String a="HELLOWORLD";
		String b="welcome";
		String c="helloworld";
		
		
		System.out.println(a.concat(b));
		System.out.println(1+3+a+5+7);
		
		//equals
		
		System.out.println(a.equals(c));
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println(a.equals(b));
		
		
		//upper lower
		
		System.out.println(b.toUpperCase());
		System.out.println(b.toLowerCase());
		
		//length
		System.out.println(a.length());
		
		//starts with ends with
		
		System.out.println(a.startsWith("HELL"));
		System.out.println(a.endsWith("WORLD"));
		
		//TRIM
		String k="                hai hello";
		System.out.println(k.trim());
		
		//replace
		
		
		String s1="hei butterfly";
		System.out.println(s1.replace("hei", "hai"));
		
		
		System.out.println(b.replace('w', 'p'));
		
		
		
		//split()
		String p="hello luminar technolab";
		String[] str= p.split(" ");
		for(String e:str) {
			System.out.println(e);
		}
		
		
		//substring
		
		System.out.println("    SUBSTRING    ");
		System.out.println(a.substring(2,5));
		System.out.println(a.substring(5));
		
		
		
		//tochararray
		System.out.println("    tochararray    ");
	    char[] arr=b.toCharArray();
		System.out.println(arr[0]);
		String s0="hello";
		char[] s=s0.toCharArray();
		for(char element:s) {
			System.out.println(element);
			
		}
		
		//contains
		System.out.println("    contains    ");
		System.out.println(a.contains(k));
		//System.out.println(b.contains());
		
		
		
		//charAt()
		System.out.println("    charAt    ");
	    System.out.println(a.charAt(3));
		
		
		

		
	}

}
