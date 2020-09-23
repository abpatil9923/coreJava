

import java.util.Scanner;

class Q27{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();

		int arr[] = new int[size];
		
		System.out.println("Enter the elements in array");
		
		for(int i=0; i<size; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++){
			
			for(int j=i+1; j<arr.length; j++) {
				
				if( arr[i] > arr[j] ) {
					
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
	
		}
		System.out.println("The smallest element is  : "+arr[0]);
		System.out.println("The smallest element is  : "+arr[size-1]);
	}
	
	
}