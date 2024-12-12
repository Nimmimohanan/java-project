package iterative_stmnts;

public class reverse_num {

	public static void main(String[] args) {
		int num=256,rev=0,rem=0;
		while(num!=0)
		{
			rem=num%10; //6...5...2
			rev=rev*10+rem; // 6   ...65...
			num=num/10; //25...2
			
		}
		System.out.println("reverse of number is:"+rev);
	}

}


