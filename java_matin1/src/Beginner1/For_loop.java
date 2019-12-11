package Beginner1;

public class For_loop {

	
	
	 
	   public static void main(String[] args) {

		     double[] myList = {1.9, 2.9, 3.4, 3.5};
		     
		     String[] cars = {"Volvo", "BMW", "Ford", "Mazda","toyoda"};
		     
		     for(int i = 0; i < cars.length; i++ ) {
		       System.out.println(cars[i]);
		     }


		      // Print all the array elements

		      for (double element: myList) {
		         System.out.println(element);
		      }
		   }

}
