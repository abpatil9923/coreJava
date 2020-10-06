
class A {
	
	protected int rollno;
	
	void getRollNo(int rollno){

		this.rollno = rollno;
	
	}
	void getData(int a) {
		
		System.out.println("first class getdata method");
	}

	
}

class B extends A{
	
	private int age;
	private String name;
	 
	@Override
	void getData(int age) {
		
		this.age = age;
	}
	
	void getName(String name) {
		
		this.name = name;
		
	}
	
	void display() {
		
		System.out.println("Roll no is  : "+rollno);
		System.out.println("Name is  : "+name);
		System.out.println("Age is  : "+age);
		System.out.println("===========================");
		
	}
	
}

public class Q46 {

	public static void main(String args[]) {
		
		
		A obj = new B();
		obj.getRollNo(1);
		
		B obj1 = (B)obj; 
		//down casting
		
		
		obj1.getData(18);
		obj1.getName("atul");
		
		
		
		A arr[] = {new B(),new A(),new B()};
		
		for(A a : arr) {
			
			if( a instanceof B) {
				
				obj1.display();
			}
		}
		
		
		
		
		
		
		
		
	}
}
