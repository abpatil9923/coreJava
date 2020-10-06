class OneBHK{
	
	
	private String roomArea;
	private String hallArea;
	private int price;
	
	OneBHK(String roomArea, String hallArea, int price){
		
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price = price;
	}
	
	void show(){
		
		System.out.println(roomArea);
		System.out.println(hallArea);
		System.out.println(price);
	}
	

}

class TwoBHK extends OneBHK{
	
	private String room2Area;
	private static int totalFlat = 0;
	
	TwoBHK(String roomArea, String hallArea, int price, String room2Area ){
		
		super(roomArea, hallArea, price);
		
		this.room2Area = room2Area;
		totalFlat += 1 ;
	}
	
	void show() {
		
		super.show();
		System.out.println(room2Area);
		
	}
	
	static void totalFlats() {
		
		System.out.println("Total Flats  : "+totalFlat);
	}
	
}

class Q43{
	
	public static void main(String args[]) {
		
		TwoBHK t = new TwoBHK("a","b",200000,"d");
		t.show();
		TwoBHK t1 = new TwoBHK("c","d",300000,"f");
		t1.show();
		TwoBHK t2 = new TwoBHK("e","e",400000,"h");
		t2.show();
		
		TwoBHK.totalFlats();
		
		
	}
	
}