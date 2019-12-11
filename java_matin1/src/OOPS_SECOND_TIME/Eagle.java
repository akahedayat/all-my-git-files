package OOPS_SECOND_TIME;

public class Eagle extends Bird {
	
	@Override
	void move() {
		
		System.out.println("Eagle move faster then any bird in the world");
 		super.move();
	}
	public Eagle() {
		System.out.println("Eagle eats bird food");
		
	}
	

}
