

import java.util.Scanner;

class Q15{
	
	public static void main(String args[]) {
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Gender");
		char gender = sc.next().charAt(0);
		
		System.out.println("Enter Age");
		int age = sc.nextInt();
		
		
		if( gender == 'm') {
			
			if( age > 22 ) {
				
				System.out.println("Eligible");
			}
			else {
				
				System.out.println("Not Eligible");
			}
			
		}else if(gender == 'f'){
			
			if( age > 18 ) {
				
				System.out.println("Eligible");
			}
			else {
				
				System.out.println("Not Eligible");
			}
		}
		else {
			
			System.out.println("Gender Not Found");
		}

	}
		
}