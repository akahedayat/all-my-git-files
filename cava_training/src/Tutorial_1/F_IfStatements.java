package Tutorial_1;

public class F_IfStatements {
	
	
	//Use else if to specify a new condition to test, if the first condition is false
	//Use switch to specify many alternative blocks of code to be executed
	 
	public static void main(String[] args) {
		int myNumber =8;
		//Use if to specify a block of code to be executed, if a specified condition is true
		if (myNumber<7) { 
			System.out.println("yes, it is true!");
		}
		//Use else to specify a block of code to be executed, if the same condition is false
		else if(myNumber>9) {
			System.out.println("No, it is false");
		}
		else {
			System.out.println("None of the above is right.");
		}
 
	}

}
