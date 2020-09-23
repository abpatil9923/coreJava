

import java.util.*;

class MathOperation{
	
	static int add(int a, int b) {
		
		return a+b;
	}
	
	static int subtract(int a, int b) {
		
		return a-b;
	}
	
	static int multiply(int a, int b) {
		
		return a*b;
	}
	
	static int power(int a, int b) {
		
		int i=1;
		while(b != 0) {
			
			i = i*a;
			b--;
		}
		
		return i;
	}
	
}

class Q35{
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a = scan.nextInt();
		
		System.out.println("Enter second number");
		int b = scan.nextInt();
	
		
		int add = MathOperation.add(a, b);
		System.out.println(add);
		
		int sub = MathOperation.subtract(a, b);
		System.out.println(sub);
		
		int mul = MathOperation.multiply(a, b);
		System.out.println(mul);
		
		int p = MathOperation.power(a, b);
		System.out.println(p);
	
		
		scan.close();
	}
}