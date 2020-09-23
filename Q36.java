

class MathOperation1{

	
	void multiply(int a, int b) {
		
		System.out.println(a*b);
	}
	
	
	void multiply(float f1, float f2, float f3) {
		
		System.out.println(f1*f2*f3);
	}
	
	void multiply(int arr[]) {
		
		int mul = 1;
		for(int a : arr) {
			
			mul = mul * a;
			
		}
		
		System.out.println(mul);
		
	}
	void multiply(int a, double d) {
		
		System.out.println(a*d);
		
	}
	
	
}

class Q36{
	
	public static void main(String args[]) {
		
		MathOperation1 m = new MathOperation1();
		
		m.multiply(10, 20);
		
		m.multiply(5.20f, 3.13f, 5.3f);
		
		int arr[] = {1,2,3};
		
		
		m.multiply(arr);
		
		m.multiply(5, 3.4);
		
	}
}