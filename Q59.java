import java.io.IOException;
import java.util.*;

class Voter{
	
	private int voterId;
	private String name;
	private int age;
	
	Voter(int voterId, String name, int age) throws Exception{
		
		if(age < 18) {
			
			throw new Exception();
		}
		
		this.voterId = voterId;
		this.name  = name;
		this.age = age;
		
	}
	
	void show(){
		
		System.out.println(voterId);
		System.out.println(name);
		System.out.println(age);
		
	}
}

public class Q59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Voter v = new Voter(11,"pallavi",17);
			v.show();
		}
		catch(Exception e) {
			
			System.out.println("invalid age for voter ");
		}
		
		
	}

}
