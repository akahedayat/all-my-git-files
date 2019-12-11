package OPSsConsept;

public class AllRooms {
	
	
	public static void main(String[] args) {
		
	LivingRoom obj1 = new LivingRoom("door",23,12);
	DiningRoom obj2 = new DiningRoom("door",18,32);
	BedRoom obj3 = new BedRoom("door",14,25);
	
	System.out.println(obj1.door);
	System.out.println(obj1.length);
	System.out.println(obj1.width);
	
	System.out.println(obj2.door);
	System.out.println(obj2.length);
	System.out.println(obj2.width);
	
	System.out.println(obj3.door);
	System.out.println(obj3.length);
	System.out.println(obj3.width);
	

}
}