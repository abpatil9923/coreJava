

import java.util.Scanner;

class Q28{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		

		String arr[] = new String[4];
		
		System.out.println("Enter the elements in array");

		for(int i=0; i < arr.length; i++){
			
			arr[i] = sc.nextLine();
		}

		for( String i : arr ){
			
			System.out.print(i+"  ");
		}
	}
	
	
}