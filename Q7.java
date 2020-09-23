
import java.util.*;


class Q7{
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of cpp");
		float cpp = sc.nextFloat();
		
		
		System.out.println("Enter the marks of dbt");
		float dbt = sc.nextFloat();
		
		System.out.println("Enter the marks of awp");
		float awp = sc.nextFloat();
		
		System.out.println("Enter the marks of ds");
		float ds = sc.nextFloat();
		
		System.out.println("Enter the marks of ms");
		float ms = sc.nextFloat();
		
	
		int per = (int) (cpp+dbt+ds+awp+ms) / 5;
				
		System.out.println("Percentage marks = "+per+"%");
	}
}
