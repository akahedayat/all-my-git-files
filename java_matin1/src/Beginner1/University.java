package Beginner1;

public class University {
	
	String name;
	String address;
	int numberOfStudents;
	int numberOfGratuationStudents;
	
	static String  university  = " Maryland Public University";
	
	public University (String universityName, String universityAddress, int numberOfStudents, int numberOfGratuationStudents ) {
		
		this.name = universityName;
		this.address = universityAddress;
		this.numberOfStudents = numberOfStudents;
		this.numberOfGratuationStudents = numberOfGratuationStudents;	
	}
	
	public static void main(String[] args) {
		
		University uni = new University("Maryland University","Maryland State", 200, 150 );
		
		System.out.println( uni.name);
		System.out.println(uni.address);
		System.out.println(uni.numberOfStudents);
		System.out.println(uni.numberOfGratuationStudents);
		
		University uni1 = new University("Virginia University", "Virginia State", 500, 490);
		
		System.out.println(uni1.name);
		System.out.println(uni1.address);
		System.out.println(uni1.numberOfStudents);
		System.out.println(uni1.numberOfGratuationStudents);
		
		University uni2 = new University("Washington University","Distrect of columbia", 100, 98 );
		
		System.out.println(uni2.name);
		System.out.println(uni2.address);
		System.out.println(uni2.numberOfStudents);
		System.out.println(uni2.numberOfGratuationStudents);
		
		
		
		
	}
	

}
