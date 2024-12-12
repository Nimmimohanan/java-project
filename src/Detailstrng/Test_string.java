package Detailstrng;

public class Test_string {

	public static void main(String[] args) {
		
		String s="Happy Faces";
		
		//uppercase
		System.out.println("--------------     UPPER CASE   -------------      ");
		String u= s.toUpperCase();
		System.out.println(u);
		
		//lower case
		System.out.println("------------     LOWER CASE   ---------      ");
		String l=s.toLowerCase();
		System.out.println(l);
		
		
		//EQUALS
		System.out.println("-------------     EQUALS  ---------      ");
	      String e="Social media";
	      String t="Social MEDIA";
	      System.out.println(e.equals(s));
	      System.out.println(e.equalsIgnoreCase(t));
	      
	      
	      //length
	      System.out.println("-------------     LENGTH  ---------      ");
	      System.out.println(e.length());
	      
	      
	      System.out.println("--------------     TRIM()  ---------      ");
	      String tr="      hai welcome      ";
	      System.out.println(tr.trim());
	      
	      

	}

}
