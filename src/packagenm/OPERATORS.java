package packagenm;

public class OPERATORS {

	public static void main(String[] args) {
		//Arithmetic operators
		int a=40 ,b=10;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		//Assignment operators
		
		int c=a; //value of a assigned to c
		
		System.out.println("The value of c "+c);
		int d=80,e=40;
		System.out.println((d+=e)); //d=d+e
		System.out.println((d-=e));//d=d-e 
		
		//Relational operators
		
		int var1=2,var2=4;
		
		System.out.println("var1==var2 "+(var1==var2));
		System.out.println("var1>var2 "+(var1>var2));
		System.out.println("var1<var2 "+(var1<var2));
		System.out.println("var1<=var2 "+(var1<=var2));
		System.out.println("var1>=var2 "+(var1>=var2));
		System.out.println("var1!=var2 "+(var1!=var2));

		
		
		//Logical operators
		
		//A   B   A&&B   A||B  !A   !B
		
		//0   0    0      0    1    1
	    //1   0    0      1    0    1
		//0   1    0      1    1    0
		//1   1    1      1    0    0
		
		String user_nm="abc";
		String password="abc@123";
		System.out.println((user_nm=="abc")&&(password=="abc@123"));
		System.out.println((user_nm=="abc")||(password=="abc@123"));
		System.out.println(!(user_nm=="HAI"));
		
		//UNARY OPERATORS
		
		int c1=20,c2=30;
		System.out.println("post increment value  c1: "+c1++); //20
		System.out.println("incremet value of c1: "+c1);//21
		System.out.println("pre increment value of c1:  "+ ++c1);//22
		
		System.out.println("post decrement value of c2: "+c2--);//30
		System.out.println("decremented value of c2: "+c2);//29
		System.out.println("predecrement value of c2: "+ --c2);//28
		
		//Ternary operators (? :)
		
		String s=c2>c1?"c2 is larger":"c1 is larger";
		System.out.println(s);
		
		
	}

}
