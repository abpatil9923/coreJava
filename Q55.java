
import java.util.*;
public class Q55 {

	public static void main(String[] args) {
	
		Scanner scan =new Scanner(System.in);

		System.out.println("enter any string");
		String str = scan.nextLine();
		
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) == ' '){
				
				count = count + 1;
			}
			
		}
		
		
		System.out.println(count+1);
		
	}

}
