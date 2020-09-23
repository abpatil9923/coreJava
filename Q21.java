

import java.util.*;

class Q21{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter size of array");
//		int size = sc.nextInt();
		
		int size = 10;
		int sum = 0;
		int avg = 0;
		
		int []arr = new int[size];
		
		System.out.println("Enter the array elemets");
		for(int i=0; i<size; i++) {
		
			arr[i] = sc.nextInt();
		}
	
//		 System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<size; i++) {
			
			sum = sum + arr[i];
					
		}
		
		System.out.println("Sum of array elements = "+sum);

		avg = sum / (size);
		System.out.println("Avrage of array elements = "+avg);
	}
	
}