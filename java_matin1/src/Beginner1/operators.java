package Beginner1;

public class operators{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 2;
		int num2 = 30;
		String name = "Omid";
		String lastName = " Hedayat";
		
		String both = name + lastName ;// how can we give space between name and last name showing on the console?
		
		int num3 = 2 + 30;
		System.out.println("the addition result for num1 and num2 is : " +num3);
		System.out.println("num1 + num2 is : " + (num1+num2));
		System.out.println("the sabstruction result for num1 + num2 is : "+ (num1 - num2));
		System.out.println("num1 + num2 is : " + (num2 - num1));
		System.out.println("num1 + num2 is : " + (num1 * num2));
		System.out.println("the division result for the num1 +num2 is  :" + (num1 / num2));
		System.out.println("the division result for the num2 + num1 is : "  + (num2 / num1));
	    System.out.println("the modulo result for the num1 + num1 is : " + (num1 % num2));
	    System.out.println(both);
	    

	}

}
