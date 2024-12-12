package decision_statements;

public class elseif_stmnt {

	public static void main(String[] args) {
		int a=2,b=5,c=8;
		
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a&&b>c)
		{
			System.out.println("b is greater ");
		}
		else
		{
			System.out.println("c is greater ");
		}
	}

}
