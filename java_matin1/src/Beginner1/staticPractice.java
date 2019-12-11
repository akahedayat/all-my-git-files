package Beginner1;

public class staticPractice {
	static String eduLevel = "School";

	static void eduLevel() {
		System.out.println("i love my school");
	}

	public static void main(String[] args) {
		 
		System.out.println(eduLevel);
		 
		System.out.println("This is my: " + staticPractice.eduLevel);

		 
	//	eduLevel();
		staticPractice.eduLevel();

	}

}
