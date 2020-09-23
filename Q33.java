

class Student3{
	
	private
		String name;
		int rno;
		static int count;

		void setData(String name, int rno) {
			
			this.name = name;
			this.rno = rno;
		}
		
		void showData() {
			
			System.out.println("Name of student is : "+name);
			System.out.println("Roll no of student is : "+rno);
		
			System.out.println("-------------------");
			System.out.println("-------------------");
		}
		
		
}

class Q33{
	
	public static void main(String args[]) {
		
		Student3 std = new Student3();
		std.setData("Atul", 7);
		
		
		Student3 std1 = new Student3();
		std1.setData("pallavi", 8);
		
		
		std.showData();
		std1.showData();
	}
}