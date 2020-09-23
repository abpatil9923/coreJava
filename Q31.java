

class Student{
	
	private
		String name;
		int rno;
		static int count;

		void setData(String n, int roll) {
			
			name = n;
			rno = roll;
		}
		
		void showData() {
			
			System.out.println("Name of student is : "+name);
			System.out.println("Roll no of student is : "+rno);
		
			System.out.println("-------------------");
			System.out.println("-------------------");
		}
		
		
}

class Q31{
	
	public static void main(String args[]) {
		
		Student std = new Student();
		std.setData("Atul", 7);
		
		
		Student std1 = new Student();
		std1.setData("pallavi", 8);
		
		
		std.showData();
		std1.showData();
	}
}