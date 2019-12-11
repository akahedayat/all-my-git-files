package Beginner1;

public class BmwCar 

{

	
	//int a = 10;
	//int a = 15;
	
	//int sum(int a, int b) {
		
	
	// Method OVERloading
	//int sum(int b, String a) {
		
	
	
	// Method OVER Writing
	
	
	
	
	
	
	
	
	
	
	
	public String tire = "Mediam";// golabal
	public String color = "Black";
	public String lights = "Shekari";
	static String aman = "from afgh";
	//..........
	
	public int sum() {
		int a = 1;/// local variable
		int b = 20;
		float a1 = 12.1f;
		float b1 = 6.1f;
		int c = 300;
		int d = 100;
		System.out.println(c - d + a );
		System.out.println(a1 -a );
		return  c - d + a;
		
		
		
	}
	
	//access Modifier  + dataTYPE + nameOfMethod+()+bodyOfclass{
	static int minus(int a, int b) {// parameter/argument
		System.out.println(a - b);
		return a - b;
	}
//}
	

	
	
	public int a = 10;
	

	
	public static void main(String[] args) {
		BmwCar obj = new BmwCar();
		System.out.println(obj.tire);
		System.out.println(obj.color);
		System.out.println(obj.lights);
		System.out.println(obj.sum());
		System.out.println(obj.minus(20,10));
		System.out.println(obj.minus(30, 15));
		System.out.println(obj.minus(100, 50));
		System.out.println();
		
		minus(200, 100);
		
	
		
		
		
	
		
		

	}

}
