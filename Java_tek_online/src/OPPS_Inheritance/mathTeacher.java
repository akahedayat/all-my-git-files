package OPPS_Inheritance;

public class mathTeacher extends Teacher {
	String mainSubject = "Math";
	String secondSubject = "chemestary";

	public static void main(String[] args) {
		
		mathTeacher ma = new mathTeacher();
		
		System.out.println(ma.designation);
		System.out.println(ma.collegeName);
		ma.jobs();
		System.out.println(ma.mainSubject);
		System.out.println(ma.secondSubject);

	}

}
