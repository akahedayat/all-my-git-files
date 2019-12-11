package Tutorial_1;

import java.util.Scanner;

public class G_Getting_User_Input {
	public static void main(String[] args) {
	Scanner myInput =new Scanner(System.in);
	System.out.println("write me a three types number:" );
	int numner= myInput.nextInt();
	
	System.out.println("what is your name?");
	String name=myInput.next();
	
	System.out.println("where do you live?");
	String location =myInput.next();
		
		
	}

}
