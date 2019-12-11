package Fifth_Code;

public class ClassWork {

	public static void main(String[] args) { //what is the different static and non static method?
		
		
		// TODO Auto-generated method stub
		ClassWork plus=new ClassWork();
		plus.ClassDuty(20, 10);
		plus.ClassDuty(10, 20, 30);
		plus.ClassDuty(35.4f, 15.10f);
		plus.ClassDuty("This is America");	
		plus.ClassDuty(false);
		
	
		

	}
	 public void ClassDuty(char a) {
		 System.out.println("This is a method with no argument");
		 
	 }
	 public void ClassDuty(int a,int b) {
		 int total=a+b;
		System.out.println(total);

		 
	 }
	 public void ClassDuty(int c,int d,int e) {
		 int num1 = c+d+e;
		 System.out.println(num1);
		 
	 }
	 public void ClassDuty(float ahmad,float jamil) {
		 float hedayat = ahmad+jamil;
		 System.out.println(hedayat);
		 
	 }
	 public void ClassDuty(String name) {
		 System.out.println(name);
	 }
	  public void ClassDuty(boolean right) {
		  System.out.println(right);
     }
}
