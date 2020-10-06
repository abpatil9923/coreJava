
import java.util.*;

class Faculty{
	
	private int facultyId;
	private int  salary;
	
	void input(int facultyId) {
		
		this.facultyId = facultyId;
	}
	
	void printSalary(int sal){
		
		System.out.println("id of faculty is  : "+facultyId);
		System.out.println("salary of faculty is  : "+sal);
	}
	
}

class FullTimeFaculty extends Faculty{
	
	private int basicSalary;
	private int allowance;
	
	void input(int id, int basicSalary,int allowance){

		super.input(id);
		this.basicSalary =  basicSalary;
		this.allowance = allowance;

		int sal = basicSalary + allowance;
		printSalary(sal);
	
	}
}

class PartTimeFaculty extends Faculty{
	
	private int workingHours;
	private int ratePerHour;
	
	void input(int id, int workingHours,int ratePerHour) {
		
		super.input(id);
		this.ratePerHour = ratePerHour;
		this.workingHours = workingHours;
		
		int sal = workingHours * ratePerHour; 
		
		printSalary(sal);
		
	}
	
}
class Q44{
	
	public static void main(String args[]) {
		
		
		PartTimeFaculty p = new PartTimeFaculty();
		p.input(1,754,754);
		
		
		FullTimeFaculty f = new FullTimeFaculty();
		f.input(2,754,754);
		
	}
}