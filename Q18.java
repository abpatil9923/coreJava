

import java.util.*;

class Q18{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int num = sc.nextInt();
		
		boolean result = false;
		
		for(int i=2; i<=num/2; i++){
			
			if( num % i == 0 ) {
				
				result = true;
			}

		}
		
		if(result == true) {
			
			System.out.println("Not Prime");
		}
		else {
			
			System.out.println("Prime");
		}

	}
	
}