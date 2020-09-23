

import java.util.Scanner;

class Q25{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();

		int arr[] = new int[size];
		
		int even = 0;
		int odd = 0;
		
		System.out.println("Enter the elements in array");
		
		for(int i=0; i<size; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++) {
			
			
			if( arr[i] % 2 == 0 ) {
				
				even++;
			}
			else {
				
				odd++;
			}
		}
		
		
		System.out.println("Sum of even numbers : "+even);
		System.out.println("Sum of odd numbers : "+odd);
	}
	
}