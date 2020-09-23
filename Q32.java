

class Student1{
	
	private
		String name;
		int rno;
		static int count;
		
		Student1(){
			
			count++;
		}
		void setData(String n, int roll) {
			
			name = n;
			rno = roll;
		}
		
		void showData() {
			
			System.out.println("Name of student is : "+name);
			System.out.println("Roll no of student is : "+rno);
			System.out.println("currently "+count+" objects are created");
		
			System.out.println("-------------------");
			System.out.println("-------------------");
		}
		
		
}

class Q32{
	
	public static void main(String args[]) {
		
		Student1 std = new Student1();
		std.setData("Atul", 7);
		
		
		Student1 std1 = new Student1();
		std1.setData("pallavi", 8);
		
		
		std.showData();
		std1.showData();
		
	}
}