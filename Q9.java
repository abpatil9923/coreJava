
import java.util.*;


class Q9{
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the days");
		
		int totalDays = sc.nextInt();
		
	
		int year = totalDays / 365;		
		System.out.println("years = "+year);
		
		int months = ( totalDays % 365 ) / 7 ;		
		System.out.println("months = "+months);
		
		int days = ( totalDays % 365 ) % 7;		
		System.out.println("days = "+days);
		
	}
}
