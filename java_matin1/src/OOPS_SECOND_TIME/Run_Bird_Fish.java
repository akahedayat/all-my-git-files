package OOPS_SECOND_TIME;

public class Run_Bird_Fish {

	public static void main(String[] args) {
		
		Animal obj = new Bird();
		obj.move();
		obj.eat();
		obj.label();
		System.out.println("1===================================");
		
		Animal obj1 = new Fish();
		obj1.move();
		obj1.eat();
		obj1.label();
		 System.out.println("-----------------------");
		 Bird obj3 = new Eagle();
		 obj3.move();
		 obj3.eat();
		 obj3.label();
 
	}

}