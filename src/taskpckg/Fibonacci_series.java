package taskpckg;

public class Fibonacci_series {

	public static void main(String[] args) {
		int sum=0,i,n1 = 0,n2 = 1;
//		System.out.println(n1);
//		System.out.println(n2);
		for(i=0;i<10;i++) {
			
			sum=n1+n2; //0+1=1 // 1+1=2 // 1+2=3  //  2+3=5  // 3+5=8
			System.out.println(n1); // 0  1  1  2  3
			n1=n2; // n1=1  n1=1  n1=2 n1=3 n1=5
			n2=sum; //n2=1  2  3  5  8
			
			
			
		}
		
	}

}
