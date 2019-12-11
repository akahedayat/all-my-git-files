package tutorial1;

//The Scanner class in Java is used for taking input from the user. 
//The Scanner class can take input of all the data types. 
//Scanner splits the input after every whitespace. This class is present in java.util package.
import java.util.Scanner;

public class Getting_User_Input {

	public static void main(String[] args) {
		
		Scanner myUser = new Scanner(System.in);
//		System.out.println("what is your name?");
//		String name = myUser.next();
		
//		System.out.println("How old are you?");
//		int age = myUser.nextInt();
//		System.out.println("Hi " + name + ", are you " + age + " years old?");
//		System.out.println("yes sir, what is your problem?");

		Scanner addtion = new Scanner(System.in);
		System.out.println("whih school do you go to?");
		String schoolName= addtion.next();
	
		System.out.println("where are you from?");
		String countryName =addtion.next();
		
		System.out.println("how old are you?");
    	int age=addtion.nextInt();
    	System.out.println("what do you do for work?");
    	String occupation=addtion.next();
    	System.out.println("what is your phone number?");
    	int phoneNumber=addtion.nextInt();
    
    	
		 
	

	}

}
