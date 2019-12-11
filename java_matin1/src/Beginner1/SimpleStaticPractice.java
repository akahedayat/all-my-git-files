package Beginner1;

public class SimpleStaticPractice {   
	static int h = 511;
	static String o = "brand";
	static void outplay () {
		System.out.println("print my outplay method");
	}
	static void anotherOutPlay() {
		System.out.println("This is my another out play method");
	}

	public static void main(String[] args) {
		SimpleStaticPractice obj= new SimpleStaticPractice();
		
		System.out.println("This is just the sample of number: " +h); // we can print our varaibles by 3 ways if we have static.
		System.out.println("my favorite number is:" +obj.h);
		System.out.println("my brand number is: " +SimpleStaticPractice.h);
		outplay();
		obj.outplay();
		SimpleStaticPractice.outplay();
		System.out.println(o);
		System.out.println(obj.o);
		System.out.println(SimpleStaticPractice.o);
		anotherOutPlay();
		obj.anotherOutPlay();
		SimpleStaticPractice.anotherOutPlay();
		
		
		
		
		

	}

}
