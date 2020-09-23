
import java.util.*;


class Q13{
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		
		int first = sc.nextInt();
		
		System.out.println("Enter second number");
		
		int second = sc.nextInt();
		
		System.out.println("Enter third number");
		int third = sc.nextInt();
		
		
		//using if else
		
//		if( (first > second) && (first > third) ) {
//			
//			System.out.println(first+ " is greater");
//		}
//		else if( (second > first) && (second > third) ) {
//			
//			System.out.println(second+ " is greater");
//		}
//		else {
//			
//			System.out.println(third+ " is greater");
//		}
		
		
		
		//using turnary
		
		int result = ( first > second) ? ( first > third ? first : third ):( second > third ? second : third);
		
		System.out.println(result+ " is greater");
	}
}
