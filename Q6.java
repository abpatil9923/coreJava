
import java.util.*;


class Q6{
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle");
		
		float input = sc.nextFloat();
		
		float area = (float) (3.14*(input*input));
		
		System.out.println("Area of circle is "+area);
		
		float cir = (float) (2*3.14*input);
		
		System.out.println("circumference of circle is "+cir);
	}
}
