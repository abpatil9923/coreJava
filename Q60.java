
interface StudentFee{
	
	void getFee() throws Exception; 
	
}

class StdInfo implements StudentFee{

	private String name;
	private int fees;
	
	@Override
	public void getFee() throws Exception {
		
		if(fees < 0) {
			
			throw new Exception();
		}
		
	}
	
	StdInfo(String name, int fees) throws Exception{
		
		this.name = name;
		this.fees = fees;
		getFee();
		
	}
	
	public String toString() {
		
		return name+"  "+fees;
		
		
	}
}

public class Q60 {

	public static void main(String[] args) {

		try {
			
			StdInfo s = new StdInfo("atul",0);
			System.out.println(s);
		}catch(Exception e) {
			
			System.out.print("please enter valid fees");
		}

		
	}

}
