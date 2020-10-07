import java.util.Scanner;

public class Q54 {

	static void reverseString(char []str) {
		
		
		for (int i = str.length - 1; i >= 0; i--)
		{
			System.out.print(str[i]);
		}
			
	}
	
	public static void main(String[] args) {

				// TODO Auto-generated method stub

				Scanner scan = new Scanner(System.in);
				
				System.out.println("Enter you name");
				String str = scan.nextLine();

				  
				        // convert String to character array 
				        // by using toCharArray 
				        char[] try1 = str.toCharArray(); 
				  
				        reverseString(try1);

	} 
	

}
