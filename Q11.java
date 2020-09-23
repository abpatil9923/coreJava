
import java.util.*;


class Q11{
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.println("before dwapping  a = "+a+ "  b = "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		
		System.out.println("after dwapping  a = "+a+ "  b = "+b);
		
	}
}
