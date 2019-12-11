package Beginner1;

public class JavaTuto {
	//variable
	// constructor: we create constructor from name of our class
	//method()
int id;
String name;
String otherSchool;

static String School = "Shahid Balkhi";

public	JavaTuto(int stuId, String studentName, String otherSchool ){// a is parametr of our constructor

	this.id = stuId;
	this.name = studentName;
	this.otherSchool = otherSchool;
}




public static void main(String[] args) {
	
	JavaTuto object = new JavaTuto(10, "Kamal", "Bakhtar");
	
	System.out.println("ID: " + object.id);
	System.out.println("Name: " + object.name);
	System.out.println("School: "+  object.otherSchool );
	
	
	JavaTuto object1 = new JavaTuto(20, "Jamal", "Habibya");
	
	System.out.println("ID: " + object1.id);
	System.out.println("Name: " + object1.name);
	System.out.println("School: "+  object1.otherSchool );
	
	
	
	JavaTuto object2 = new JavaTuto(20, "Hasib", "Esteqlal");
	
	System.out.println("ID: " + object2.id);
	System.out.println("Name: " + object2.name);
	System.out.println("School: "+  object2.otherSchool );
	
	
	

}

}
