

import java.util.*;

class Q24{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();

		System.out.println("Enter the element which you want to search");
		int search = sc.nextInt();
		
		int []arr = new int[size];
		
		System.out.println("Enter the elements in array");
		
		for(int i=0; i<size; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++) {
			
			if( search == arr[i] ) {
				
				System.out.println( arr[i]+" found at position : "+i);
			}
		}
		
	}
	
}