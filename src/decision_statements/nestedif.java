package decision_statements;

public class nestedif {

	public static void main(String[] args) {
		int a=58;
		if(a%5==0)
		{
		if(a%11==0)	{
			System.out.println("Divisible by 5 and 11");
			
		}
		else{
			System.out.println("not Divisible by 11 5 only");
		}
		
		}
		else {
			
			System.out.println("not Divisible by 5 ");
		}
		
	}
	}


