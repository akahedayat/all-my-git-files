package Spotrs;

public class ALL_SPORTS {

	public static void main(String[] args) {
BoxingSection box = new BoxingSection();
		
		System.out.println(box.workOut);
		System.out.println(box.workOut1);
		box.task();
		System.out.println(box.mainSection);
	System.out.println("1----------------------------");
	System.out.println();
	kangfuSection kick = new kangfuSection();
	
	System.out.println(kick.workOut);
	System.out.println(kick.workOut1);
	kick.task();
	System.out.println(kick.mainSection);
	System.out.println("2-----------------------------");
	System.out.println();
	wrestling wrest = new wrestling();
	
	System.out.println(wrest.workOut);
	System.out.println(wrest.workOut1);
	wrest.task();
	System.out.println(wrest.wrestlingSection);
	
 
	}

}
