package Beginner1;

public class JavaArrays {
	
	public static void main(String[] args) {
		// syntax 1
		int [] num = new int [4];
		num [0] = 5;
		num [1] = 21;
		num[2] = 14;
		num[3] = 20;
		
		System.out.println(num[3]);
		System.out.println(num[2]);
		System.out.println(num[1]);
		System.out.println(num[0]);
		 ;
	 String[] province = new String[5];
	 province[0] = "kabul";
	 province[1] = "Mazar";
	 province[2] = "laghman";
	 province[3] = "pnjsher";
	 province[4] = "Faryab";
     
     System.out.println(province[4]);
     // syntax 2
     String names [] = new  String[4];
     names[3] = "Ajmal";
     names[2] = "Jamil";
     names[1] = "Muneer";
     names[0] = "Jawad";   
     System.out.println(names [3]);
     System.out.println(names [2]);
     System.out.println(names [1]);
     System.out.println(names [0]);
      
      // syntax 3
      int [] numbers = {12,14,20,56,61}; // we can use the square brackets before array name or after array name.
      String country [] = new String[6];
      country[0] = "Canada";
      country[1] = "Germany";
      country[2] = "Itly";
      country[3] = "Japan";
      country[4] = "Uzbekistan";
      country[5]= "Tajekistan";
      System.out.println(country [4]);
      
      String book[] ={"History","Jokes","Sports","LoveStory"}; // we can sue data type, array name,square brackets,equal sign, start the courely braces give many values.
      System.out.println(book[2]);
      String phoneCategories[]= {"S9","max10","7S","8SE","11 S max"};
      int buildingNumbers[]= {4801,4545,1090,7412,100};
      System.out.println("Annadale building number is this: " + buildingNumbers [3]); 
      System.out.println("This is an iphone:" + phoneCategories[4]);
      	
      
      // Changing the elements of array name.
      String[] cars =  {"BMW","COROLLA","NISSAN","JEEP","CAMRY"};
  cars[2] = "Mazda";  
      System.out.println(cars[2]);
      
      //System.out.println(country.length);
      
      
     
     
    		 
     
     
		
		
		
		
		
		
		
		
	
}
}