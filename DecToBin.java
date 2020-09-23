import java.util.*;

class DecToBin{
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
	
		int bin[] = new int[5];
		
		System.out.println("Enter number");
		int num = scan.nextInt();
		
		for(int i=0; num > 0; i++) {
			
			bin[i] = num%2;
			num = num/2;
			
		}
		
		for(int i=bin.length-1; i > 0; i--) {
			
			System.out.print(i+"  ");
			
		}

	}
}