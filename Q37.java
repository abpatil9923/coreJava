
class Person{
	
	private String name;
	private int age = 18;
	
	Person(String name, int age){
		
		this.name = name;
		this.age = age;
	}
	
	Person(String name){
		
		this.name = name;
	}
	
	void Display() {
		
		System.out.println("Name : "+name+"     Age : "+age);
	}
	
	
}

class Q37{
	
	public static void main(String args[]) {
		
		Person p1 = new Person("atul",23);
		p1.Display();

		Person p2 = new Person("pallavi");
		p2.Display();
		
		Person p3 = new Person("gaju",24);
		p3.Display();
		
		Person p4 = new Person("sonu",23);
		p4.Display();
		
	}
}