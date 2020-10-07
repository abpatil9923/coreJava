
import java.util.*; 
	
public class ReverseArrayList {

		public static void main(String[] args) { 
		
			List list = new ArrayList<>(); 
		
			list.add(10); 
			list.add(50); 
	
			list.add(30); 
		
			ListIterator i = list.listIterator(); 
			System.out.println("printing the list...."); 
		
			while(i.hasNext()) 
			{ 
				System.out.println(i.next()); 
			} 
			
			
			System.out.println("printing list in reverse order...."); 
			
			while(i.hasPrevious()) 
			{ 
				System.out.println(i.previous()); 
			} 
			
		
			Iterator i2 = list.iterator(); 
		
			Collections.reverse(list); 
			System.out.println("printing list in reverse order...."); 
	
			while(i2.hasNext()) 
			{ 
				System.out.println(i2.next()); 
			} 
	
		} 
 

}
