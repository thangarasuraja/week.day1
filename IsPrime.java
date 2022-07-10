package week1day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12;
		int Remainder=0;
		for (int i = 2; i <= n-1; i++) {
			if (n%i==0) {
				System.out.println("It is a not a Prime number");
				Remainder=1;
				break;
			}
			
				
				}
		if(Remainder==0) {
 			System.out.println("It is prime number");
			}

	}

}
