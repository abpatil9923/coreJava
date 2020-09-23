
import java.util.*;


class Q8{
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		float p = sc.nextFloat();
		
		
		System.out.println("Enter the rate");
		float r = sc.nextFloat();
		
		System.out.println("Enter the duration");
		float t = sc.nextFloat();
		
		float intrest = (p*r*t)/100;
						
		System.out.println("Intrest is = "+intrest);
	}
}
