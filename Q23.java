

import java.util.*;

class Q23{
	
	public static void main(String args[]) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("size of array");
		
		int size = sc.nextInt();
		
		int []arr = new int[size];
		
		for(int i=0; i<size; i++){
			
			arr[i] = sc.nextInt();
		}
		
		int a=0;
		int b=size-1;
		
		while( a < b ) {
			
			int temp;
			temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;	
			a++;
			b--;
			
		}
		
		System.out.print("reverse order of array : ");
		for(int i=0; i<size; i++) {
			
			System.out.print(arr[i]+"  ");
		}
		
	}
}