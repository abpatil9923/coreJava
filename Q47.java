
class _Person{
	
	private String gender;

	_Person(String gender){
		
		this.gender = gender;
	}
	
	void show() {
		
		System.out.println(gender);
	}
	
}

class Employee extends _Person{
	
	private String empName;
	private int empId;
	
	Employee(int empId,String empName,String g){

		super(g);
		this.empId = empId;
		this.empName = empName;
	
	}
	
	void show() {
		
		System.out.println(empId);
		System.out.println(empName);
		super.show();
	}
	
}

public class Q47 {

	public static void main(String[] args) {


	Employee e1 = new Employee(1,"Atul","male");
	e1.show();
	Employee e2 = new Employee(2,"pallu","female");
	e2.show();
	Employee e3 = new Employee(3,"sakshi","female");
	e3.show();
	Employee e4 = new Employee(4,"prachi","female");
	e4.show();
	}

}
