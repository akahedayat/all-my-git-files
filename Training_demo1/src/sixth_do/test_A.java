package sixth_do;

public class test_A {
/*creat global variables for each access modifiers and call thes modifiers in other classes with in same 
packages and outside packages.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test_B afg=new test_B();
		System.out.println(afg.sch+6);
		System.out.println(afg.field+2);
		System.out.println(afg.mosque=10);
		afg.office();
		afg.getCls();
		afg.setCls(250);
		

	}

}
