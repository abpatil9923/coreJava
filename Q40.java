import java.util.*;

class Student2{
	
	private String name;
	private int rollNo;
	private int age;
	private float score;

	Student2(String name,int rollNo, int age, float score){
		
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		this.score = score;
	}

	
	static void arrangeStdents(Student2 arr[][]) {
			
		for(Student2 arr1[] : arr) {
			for(Student2 a : arr1) {
				
				System.out.println("Name of student     : "+a.name);
				System.out.println("Roll no of student     : "+a.rollNo);
				System.out.println("Age of student     : "+a.age);
				System.out.println("Score of student    : "+a.score);
				System.out.println("Score of student    : "+a.score);
				System.out.println("===================================");
				
			}
			
		} 
		
	}

}
class Q40{
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);

		
		Student2 s1[] = new Student2[3];
		int s_1 = 0;
		Student2 s2[] = new Student2[3];
		int s_2 = 0;
		Student2 s3[] = new Student2[3];
		int s_3 = 0;
		Student2 s4[] = new Student2[3];
		int s_4 = 0;
		
		for(int i=0; i<9; i++) {
				
				System.out.println("Enter name");
				String name = scan.next();
				
				System.out.println("Enter roll number");
				int rollno = scan.nextInt();
				
				System.out.println("Enter age");
				int age = scan.nextInt();
				
				System.out.println("Enter score");
				float score = scan.nextFloat();
				
				Student2 s = new Student2(name,rollno,age,score);

				if( score <= 50) {
					
					s1[s_1] =  s;
					s_1++;
				}
				else if( score > 50 && score <= 65 ) {
				
					s2[s_1] = s;
					s_2++;
				}
				else if( score > 65 && score <= 80 ) {
				
					s3[s_3] = s;
					s_3++;
				}
				else {
				
					s4[s_4] = s;
					s_4++;
				}
		}
	
		Student2 s[][] = new Student2[4][];
		
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		s[3] = s4;
		
		Student2.arrangeStdents(s);
	
	}
}