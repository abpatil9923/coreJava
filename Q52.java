import java.util.*;

public class Q52 {

	static int vowelCount(String str) {
		
		int sum =0;
		
		for(int i=0; i<str.length(); i++) {
			
			if( str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || 
					str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'I' 
					|| str.charAt(i) == 'o' || str.charAt(i) == 'O' || 
					str.charAt(i) == 'u' || str.charAt(i) == 'U') {
				
				sum = sum + 1;
			}
		}
		
		return sum;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter you name");
		String str = scan.nextLine();
		
		System.out.println(vowelCount(str));
	}

}
