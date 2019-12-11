package Beginner1;



public class Students {
	int id;
	String name;
	char Grade;
	String Address;
	 
	static String School = "Bakhtar High School";
	
	
	public String getStudentsInfo() {
		String stu = "this student is very inteligent ";
		
		return stu;
	}
	
	
	

	
	public static void main(String[] args) {
		
		Students object = new Students();
		
		object.id = 1;
		object.name = "Zuhor";
		object.Grade = 'A';
		object.Address = "Pisht Bagh";
		
		System.out.println("ID:" + object.id);
		System.out.println("Name: " + object.name);
		System.out.println("Grade: " + object.Grade);
		System.out.println("Adress " + object.Address);
		
		
	System.out.println("School: " + School);
	
	object.getStudentsInfo();
	
	object.id = 2;
	object.name = "Hedayet";
	object.Grade = 'B';
	object.Address = "Hawai";

	
	
	System.out.println("ID:" + object.id);
	System.out.println("Name: " + object.name);
	System.out.println("Grade: " + object.Grade);
	System.out.println("Adress " + object.Address);
	
System.out.println("School: " + School);
	
	object.getStudentsInfo();
	
	object.id = 3;
	object.name = "Hasib";
	object.Grade = 'C';
	object.Address = "Now Abad";
	
	
	System.out.println("ID:" + object.id);
	System.out.println("Name: " + object.name);
	System.out.println("Grade: " + object.Grade);
	System.out.println("Adress " + object.Address);
	
	
System.out.println("School: " + School);
	
	object.getStudentsInfo();

	}

}

