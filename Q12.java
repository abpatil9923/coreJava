
import java.util.*;


class Q12{
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee salary");
		int sal = sc.nextInt();

		if( sal < 10000 ) {
			
			float HRA = (float) (sal*0.10 );
			float DA =(float) (sal*0.90); 
			
			int gross = ( int ) ( sal + DA + HRA ); 
			
			System.out.println("gross salary is "+gross);
		}
		else if( sal >= 10000 ) {
			
			int HRA = 2000;
			float DA = (float) (sal*0.98); 
			int gross = ( int ) ( sal + DA + HRA ); 
			
			System.out.println("gross salary is "+gross);
		}
		
		
		System.out.println();
		
	}
}
