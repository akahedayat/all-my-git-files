package Beginner1;

public class PmtrizedCons{
	
	int a = 10;
	public int b = 20;
	private int c = 25;
	protected int d = 55;
	public static int h = 5;
	
	public void omid () {
		
	}
	
	public int hedayat () {
		int a = 1;
		int b = 2;
		int c = a+b;
		System.out.println(c);
		 return c;
	}
	
	
	String omid;
	
	PmtrizedCons(int b,int c,int d){
		
		this.omid = "wellcome";
	
	}
	public static void main(String[] args) {
		
		PmtrizedCons obj = new PmtrizedCons(55, 6, 8);
		System.out.println(obj.omid);
		System.out.println(obj.h);		
		obj.hedayat();
		System.out.println(obj.h+obj.a);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
