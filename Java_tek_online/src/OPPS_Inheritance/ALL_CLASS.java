package OPPS_Inheritance;

public class ALL_CLASS {

	public static void main(String[] args) {
		PhysicsTeacher physic = new PhysicsTeacher();
		System.out.println(physic.designation);
		System.out.println(physic.collegeName);
		physic.jobs();
		System.out.println(physic.mainsub);
		System.out.println("1=====================================");
		System.out.println();

		EnglishTeacher Eng = new EnglishTeacher();

		System.out.println(Eng.designation);
		System.out.println(Eng.collegeName);
		Eng.jobs();
		System.out.println(Eng.mainSubject);
		System.out.println("2======================================");
		System.out.println();

		mathTeacher ma = new mathTeacher();

		System.out.println(ma.designation);
		System.out.println(ma.collegeName);
		ma.jobs();
		System.out.println(ma.mainSubject);
		System.out.println();
		System.out.println("THE END!");
	}

}
