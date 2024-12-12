package iterative_stmnts;

public class Count_of_num {

	public static void main(String[] args) {
		int n=58769,cnt=0;
		
		while(n>0)
		{
			n=n/10; //5876/10 =587 // 587/10= 58 //58/10=5 // 5/10=0
			cnt++; //1 //2  //3  //4
			
		}
		
		System.out.println("count of the digits  :"+cnt);	
			

	}

}
