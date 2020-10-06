import java.util.*;

class Student5{
	
	private int rollno;
	private float percentage;
	static private int countAgrade = 0;
	Student5(){
		
	}
	Student5(int rollno, float percentage){
		
		
		this.rollno = rollno;
		this.percentage = percentage;
		
	}
	void show() {
		
		System.out.println("roll no is  : "+rollno);
		System.out.println("roll no is  : "+percentage);
	}
	
	static void aGrade(Student5 arr[]) {
		
		for(Student5 a : arr) {
			
			if(a.percentage > 75) {
				
				countAgrade = countAgrade + 1;
			}
		}
		
		System.out.println(countAgrade+" Students has A grade ");
	}
	
	static void searchRecord(Student5 arr[],int roll) {
		
		
		for(Student5 a : arr) {
			
			if(a.rollno == roll ) {
				
				System.out.println("roll Number :"+a.rollno);
				System.out.println("percentage  :"+a.percentage);
			}
		}
	}
}

class CollegeStudent extends Student5{
	
     private int semester ;
     
     CollegeStudent(){
		
 	}
     
      CollegeStudent(int rollno, float percentage, int semester ){
    	 
    	 super(rollno,percentage);
    	 this.semester  = semester ;
     }
     
     void show() {
    	 super.show();
    	 System.out.println("Semister is  : "+semester);
     }
}

class SchoolStudent extends Student5 {
	
	private String className;
	
	SchoolStudent(){
		
		
	}
	SchoolStudent(int rollno, float percentage, String className){
		
		super(rollno,percentage);
		this.className = className;
	}
	
	void show() {
		
		super.show();
		System.out.println("Semister is  : "+className);
		
	}
	
	
}


class Q45{
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		Student5  s[] = new Student5[3];
		
		for(int i=0; i<s.length; i++) {
		
			
		
			System.out.println("Enter your choice  : ");
			System.out.println("========================");
			System.out.println("1) College Student : ");
			System.out.println("2) School Student  : "); 
			System.out.println("========================");
		
			int choice = scan.nextInt();
				switch(choice) {
				
					case 1:
							System.out.println("Enter your rollno : ");
							int rollno = scan.nextInt();
							System.out.println("Enter your percentage : ");
							float per = scan.nextFloat();
							System.out.println("Enter your Semister : ");
							int sem = scan.nextInt();
							Student5 obj = new CollegeStudent(rollno,per,sem);
							s[i] = obj;
							break;
							
					case 2:
							System.out.println("Enter your rollno : ");
							int rollno1 = scan.nextInt();
							System.out.println("Enter your percentage : ");
							float per1 = scan.nextFloat();
							System.out.println("Enter your class name : ");
							String className = scan.next();
							Student5 obj1 = new SchoolStudent(rollno1,per1,className);
							s[i] = obj1;
							break;
					
					default :
							System.out.println("Invalid Choice");
							break;
				
				}

		}
		
		System.out.println("Do you want to search element  1)yes 2)NO ");
		int flag = scan.nextInt();
		
		if(flag == 1) {
			
			System.out.println("Enter number Which you want search");
			int search = scan.nextInt();
			
			Student5.searchRecord(s,search);
		}

		
		Student5.aGrade(s);

	}
}