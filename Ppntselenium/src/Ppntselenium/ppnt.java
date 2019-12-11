package Ppntselenium;

import java.util.Scanner;

public class ppnt {
	

	public static void main(String[] args) {
	/* this read the input provided by user
	* using keyboard
	*/
	Scanner scan=new Scanner (System.in);

	System.out.print("enter first number:");

	// This method reads the numbers provided using keyboard
	
	int num1 = scan.nextInt();
	System.out.println("enter second number");
	int num2 = scan.nextInt();
	//closing scane
	
	int product= num1*num2;
	System.out.println("output"+product);}}

	


