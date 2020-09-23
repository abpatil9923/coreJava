

import java.util.*;

class Q20{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter begin number");
		int startnum = sc.nextInt();
		
		int i,j;
		
		System.out.println("Enter last number");
		int endnum = sc.nextInt();
		

		for(i=startnum; i <= endnum; i++){
			
			int flag = 1;

			for(j=2; j<=i/2; ++j) {
				
				if( i % j == 0 ) {					
					flag = 0;
					break;	
				}

			}
			
			if(flag == 1) {
				
				System.out.println(i);
			
			}

		}

	}
	
}