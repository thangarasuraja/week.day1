package week1day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value1=0;
		int value2=1;
		int sum=0;
		
		System.out.println(value1);
		System.out.println(value2);
		
		for (int i = 2; i <11; i++) {
			sum=value1+value2;
			value1=value2;
			value2=sum;
			System.out.println(sum);
		}
	
			
			
		
	
	}
			
			
			
		
		
	
		}

	


