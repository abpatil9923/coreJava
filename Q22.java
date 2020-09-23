 

import java.util.*;

class Q22{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int length = 5;
		
		int []arr = new int[length];

		System.out.println("Enter array elements");
		for(int i=0; i<length; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<length; i++) {
			
			for(int j=i+1; j<length; j++) {
				
				if( arr[i] < arr[j] ) {
					
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.print("Descending order of array : ");
		for(int i=0; i<length; i++) {
			
			System.out.print(arr[i]+"  ");
		}
		
	}
}