
import java.util.*;

class Q14{
	
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter year");
		
		int year = sc.nextInt();
	
		if( ( year % 4 == 0 || year % 400 == 0 ) && year % 100 != 0 ) {
			
			System.out.println("Given Year Is Leap Year");
		}
		else {
			
			System.out.println("Given Year Is Not Leap Year");
		}
	}
}