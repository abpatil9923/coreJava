class Student4{
	
	private String name;
	private int age;
	private float marks;
	private float sportsMarks;
		
	Student4(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	Student4(String name, int age, float marks, float sportsMarks) {
		
		this(name,age);
		this.marks = marks;
		this.sportsMarks = sportsMarks;
		
	}
	
	void show() {
		
		System.out.println("Name           : "+name);
		System.out.println("Age            : "+age);
		System.out.println("Marks          : "+marks);
		System.out.println("Sports Makrs   : "+sportsMarks);		
	}
}

class Q41{
	
	public static void main(String args[]) {
		
		Student4 s = new Student4("Pallavi", 20, 80.40f,67.50f);
		s.show();
	}
}