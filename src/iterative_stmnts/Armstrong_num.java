package iterative_stmnts;

public class Armstrong_num {

	public static void main(String[] args) {
		int a=370,b=0,result=0,num=0;
		num=a;
		
		while(a>0)
		{
			
			b=a%10; //153%10=3   .. 15%10=5 .. 1%10= 1
			result=result+b*b*b; //0+3*3*3= 27  ..27+5*5*5=152 ..152+1*1*1=153
			a=a/10;  //153/10=15  ..15/10=1 ..1/10=0
			
//			System.out.println(b);
//			System.out.println(result);
//			System.out.println(a);
			
			
		}
		
		if(num==result)
		{
			System.out.println(num+ " is an Armstrong number");
	    }
		else
		{
			System.out.println(num+ " Not an Armstrong number");
		}
			
	}

}



