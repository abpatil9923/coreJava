
import java.util.*;

class Product {
	
	private int pid;
	private int price;
	private int quantity;
	
	
	Product(int pid, int price, int quantity){
	
			this.pid = pid;
			this.price = price;
			this.quantity = quantity;
	}
	
	static void highestPriceProduct(Product arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
			 
				if(arr[i].price > arr[j].price) {
					
					int temp = arr[i].price;
					arr[i].price = arr[j].price;
					arr[j].price = temp;
				}
			}
		}
		
		int len = arr.length-1;
		System.out.println("=========================================");
		System.out.println("Highest price product is " +arr[len].price);
		System.out.println("=========================================");
	}
	

	
	static void totalAmountSpentOnProduct(Product arr[]) {
		
		for(Product a : arr) {
			
			int total = a.price * a.quantity;
		
	
			System.out.println("total amount spent by pId "+a.pid+" is : "+total);
			System.out.println("================================================");
		}
		
	}
	

}

class Q39{
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		Product arr[] = new Product[3];  
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println("Enter pid");
			int pid = scan.nextInt();
			
			System.out.println("Enter price");
			int price = scan.nextInt();
			
			System.out.println("Enter quantity");
			int quantity = scan.nextInt();
			
			Product p = new Product(pid, price, quantity);
			
			arr[i] = p;
		}
		
		
		Product.highestPriceProduct(arr);
		
		Product.totalAmountSpentOnProduct(arr);
		
	}
	
}