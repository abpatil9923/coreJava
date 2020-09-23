
import java.util.*;

class Circle{
	
		private float radius;
		private float area;

		
		void init(float radius) {
			
			this.radius = radius;
		
		}
		
		void calculateArea() {
			
			area = 3.14f*(radius*radius);
		}
		
		void Display() {
			
			System.out.println("radius of cicle is  "+radius);
			System.out.println("Area of cirle is  "+area);
		}
		
		
}

class Q34{
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter radius");
		float radius = scan.nextFloat();
		
		Circle c = new Circle();
		c.init(radius);
		c.calculateArea();
		c.Display();
		
	}
}