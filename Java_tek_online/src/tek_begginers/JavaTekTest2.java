package tek_begginers;



public class JavaTekTest2 {
	
	
		
		
		
	// 1- create a global variable and then print in the console.
	String schoolName = "Istiqlal";
	int computerCode = 34500;
	static String myName = "Hedayat";
	// 2- Create a static variable assign a value, then print in the console with using three different ways of printing.
	static int phoneCode = 12345;
	
	public static void main(String[] args) { 
		
			JavaTekTest2 obj = new JavaTekTest2();
			// 3- Create a static method.inside the method create a variable and assign a value to it, then print in the console use three different ways to print.
			System.out.println("object of class: "+obj.firstandlastname());
			System.out.println("method name: "+firstandlastname());
		
			System.out.println("class name: "+JavaTekTest2.firstandlastname()+"\n");
			
			//printing static variable 
			System.out.println("printing with variable name: "+myName);
			System.out.println("printing with object of class: "+obj.myName);
			System.out.println("printing with class name: "+JavaTekTest2.myName +"\n");
	
			System.out.println("line 31: "+obj.myNumber());
	
			obj.myNumber();
	 
	}
	public static String firstandlastname () {
		String n = "Najib ";
		String k = " Kabuli";
		return n + k ;
		
	}
	// 4- Create a non-static method, create a variable inside the method and assign a value to it, then print the value it the console
		public int myNumber() {
		 int o = 21;
		 int f = 35;
		 int g=f+o;
		System.out.println("inside method print out: "+g);
		 return g;
		 
		
			
		}
		
		
	}




