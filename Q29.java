
import java.util.*;

class Q29{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = {1, 2, 3};
		int b[] = {4, 5, 6};
		int c[] = {7, 8, 9};
		int d[] = {10, 11, 12};
		
		int arr[][] = new int[4][];
		
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d;
		
		
		int ondarray = 0;
		int elecount = 0;
		
		for(int arr1[] : arr) {
			
			ondarray = ondarray + 1;
			
			for(int e : arr1 ) {
				
				elecount = elecount + 1;
				System.out.print(e+"    ");
			}
			
			System.out.println("");
		}
		
		System.out.println(ondarray);
		System.out.println(elecount);
	}
}