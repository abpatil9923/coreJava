

import java.util.*;

class Q19{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number which till you want to print the series of power 2");
		
		int num = sc.nextInt();
		
		int sum = 0;  
		
		for(int i=1; i<=num; i++){
			
			if( i == num ) {
				
				sum = sum+i*i; 
				System.out.print(i*i+" = "+sum);
				
			}
			else {
				
				System.out.print(i*i+"+");
				sum = sum+i*i;
			} 
			
		}
		

	}
	
}