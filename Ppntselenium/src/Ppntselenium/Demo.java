package Ppntselenium;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Object system;
		/* this read the input provided by user
		* using keyboard
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("sdkfdskf");

		System.out.println("enter first number:");

		// This method reads the numbers provided using keyboard

		int num1=scan.nextInt();
		
		int num2=scan.nextInt();
		//closing scanner after the use
		scan.close();
		int product= num1*num2;
		
		System.out.println("output"+product);}}
	
