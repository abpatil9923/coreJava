
class Employee1{
	
	private static int empcount;
	private static int empNo = 0;
	private int salary;
	private static int totalSalary = 0;
	
	Employee1(int salary) {
	
		empNo = empNo + 1; 
		this.salary = salary;
		empcount = empcount + 1;
		totalSalary = totalSalary + salary;
	}
	
	void Display() {
		
		System.out.println("emp Number : " +empNo+"  emp salary : "+salary);
		System.out.println("==================================");
	}
	static void DisplayTotalsal() {
		
		System.out.println("Total Number of Employee : " +empcount+"  Total salary : "+totalSalary);
	}
	
}

class Q38{
	
	public static void main(String args[]) {
		
		Employee1 emp = new Employee1(50000);
		emp.Display();
		
		Employee1 emp1 = new Employee1(60000);
		emp1.Display();
		
		Employee1 emp2 = new Employee1(70000);
		emp2.Display();
		
		Employee1.DisplayTotalsal();
		
	}
}