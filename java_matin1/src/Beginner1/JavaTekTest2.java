package Beginner1;

public class JavaTekTest2 {
	// 1- create a global variable and then print in the console.
	// 2- Create a static variable assign a value, then print in the console with using three different ways of printing.
	// 3- Create a static method.inside the method create a variable and assign a variable to it, then print in the console use three different ways to print.
	// 4- Create a non-static method, create a variable inside the method and assign a value to it, then print the value it the conso

 
	
	// we access golobal varibals values through object
	
	String tire = "54 japani";
	String color = "black";
	String lights = "Shekari";
	
	// static varibales 
	static String doors = "4 door";
	
	int familyPhoneNumber = 2020;
	
	static int  myPhoneNumber = 4040;
	
	public static void main(String[] args) {

		 JavaTekTest2 b = new JavaTekTest2();
	// JavaTekTest2 C = new JavaTekTest2();
		 
		System.out.println(b.familyPhoneNumber);
		// accessing 
		
		// one accessing 
		System.out.println(b.tire);
		System.out.println(b.color);
		System.out.println(b.lights);
		
		// 3 way accessing 
		System.out.println(b .doors);
		System.out.println(JavaTekTest2.doors);
		System.out.println(doors);
		
// invoking // calling 
		System.out.println(JavaTekTest2.sum());
		System.out.println(sum());
		System.out.println(b.sum());
		
		String myName = "Ahmad";
		System.out.println(myName);
		
		
		
		
	}
	static	public int sum () {
		// local variable
		int a = 100;
		int h = 200;
		
		  
		return h + a;
		
	 
			
		   
			
		}

	
		
	}


