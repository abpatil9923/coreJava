
import java.util.*;

class Q17{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int num = sc.nextInt();
		
		int rem;
		int newnum = 0;
		
		while( num > 0 ) {
			
			rem = num % 10;
			newnum = newnum * 10 + rem;
			num = num / 10;
		}
		
		System.out.println(newnum);
	}
	
}