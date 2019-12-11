package OPPS_Inheritance;

public class EnglishTeacher extends Teacher{
	String mainSubject= "English";

	public static void main(String[] args) {
		EnglishTeacher Eng = new EnglishTeacher();
		
		System.out.println(Eng.designation);
		System.out.println(Eng.collegeName);
		Eng.jobs();
		System.out.println(Eng.mainSubject);
 
	}

}
