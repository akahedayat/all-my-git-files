package Beginner1;

public class consChaining1 {

	public String officerName;
	public String officerRank;
	public String officerSallary;
	public String offUnitName;
	public int officerAge;
	public String officerRides;
	public int officerCellNumber;

	consChaining1() {

		this("YaqubKhan");
	}

	public consChaining1(String name) {
		this(name, "General");
	}

	public consChaining1(String name, String rank) {
		this(name, rank, "25000Afs");

	}

	public consChaining1(String name, String rank, String sallary) {
		this(name, rank, sallary, "Shaheen 209th Corps");
	}

	public consChaining1(String name, String rank, String sallary, String Unitname) {
		this(name, rank, sallary, Unitname, 45);

	}

	public consChaining1(String name, String rank, String sallary, String Unitename, int age) {
		this(name,rank,sallary,Unitename, 45, "1 luxess and 2 Rangers");
	}
			
		
	public consChaining1(String name, String rank, String sallary, String Unitename, int age,String Rides) {
		this(name,rank,sallary,Unitename, 45, Rides, 2028489626);
	}
	public consChaining1(String name, String rank, String sallary, String Unitename, int age,String Rides, int cellNumber) {
		
	
		
		this.officerName = name;
		this.officerRank = rank;
		this.officerSallary = sallary;
		this.offUnitName = Unitename;
		this.officerAge = age;
		this.officerRides= Rides;
		this.officerCellNumber= cellNumber;
	
	}
	void officerInfo() {
		System.out.println("My name is: " +officerName);
		System.out.println("My rank is: " +officerRank);
		System.out.println("My sallary is: " +officerSallary);
		System.out.println("My Unit name is: " +offUnitName);
		System.out.println("My age is : " +officerAge);
		System.out.println("The rides i have only: " +officerRides);
		System.out.println("This is my CellPhone Number: " +officerCellNumber);

	}

	public static void main(String[] args)  {
		consChaining1 obj = new consChaining1();
		obj.officerInfo();
	 
	}	

}
