
import java.util.*;

public class Q58 {

	public static void main(String[] args) {

		String [] days = {"Sunday","Monday","Tuesday","wednesday","Thursday","Friday","Saturday"}; 

		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter you choice");
		
		int num = scan.nextInt();
		
		if(num == 1 || num == 2 || num == 3 || num == 4 ||num == 5 ||num == 6 || num == 7) {
			
			System.out.println(days[num-1]);	
		}
		else {
			
			System.out.println("out of range");		
		}
		
			
	}

}
