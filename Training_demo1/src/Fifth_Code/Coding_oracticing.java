package Fifth_Code;

public class Coding_oracticing {
	int u=60;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Coding_oracticing door=new Coding_oracticing();
door.Number(); // omid is reference variable to the consturctor, and hedayat is the name of the method

System.out.println(door.u);

door.Number(100, 200,300);
door.Number(600,200);
door.Number(9.6f,8.2f);
door.Number("Hedayat");
	}

	public void Number() {  
		
		System.out.println("This is non-static method");
	}
	public void Number(int a,int r) {
		int t=a+r;
		System.out.println(t);
		}
	public void Number(int a,int b,int c) {
		int i=a+b+c;
		System.out.println(i);}
		public void Number(float a,float b) {
		float h = a+b;
		System.out.println(h);
		
}
		public void Number(String name) {
			System.out.println(name);
		}
}

