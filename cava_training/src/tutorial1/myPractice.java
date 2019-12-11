package tutorial1;

public class myPractice {
	String school = "Bakhtar";
	int Number = 786;
	 
	public myPractice(String mySchool, int myNumber) {
		
		this.school = mySchool;
		this.Number = myNumber;
	}

	public static void main(String[] args) {
		myPractice obj = new myPractice("Bakhtar", 786) ;
			System.out.println(obj.school);
			System.out.println(obj.Number);
		
		
	
		
		

}
}