
import java.util.*;

class Q30{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[3][3];

		
		//scanning
		
		for(int i=0; i<arr.length;i++) {
			
			for(int j=0; j<arr.length; j++) {
				
				System.out.println("enter element");
				arr[i][j] = sc.nextInt();
			}
		}

		//logic
		int sum = 0;
		for(int i=0; i<arr.length;i++) {
			
			for(int j=0; j<arr.length; j++) {
	
				if( i == j ) {
					
					sum = sum + arr[i][j];
				}
			}
		}
		
//		List of array
		
		for(int arr1[] : arr) {
			
			for(int a : arr1) {
				
				System.out.print(a+"  ");
			}
			
			System.out.println("");
		}
		
		// Sum of Diagonal elements
		
		System.out.println("Sum of diagonal elements = "+sum);
		
	}
}