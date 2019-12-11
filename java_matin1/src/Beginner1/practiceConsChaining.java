package Beginner1;

public class practiceConsChaining {

	public String myName;
	public int myNumber;
	public String myAddress;

	practiceConsChaining() {
		this("Hedayat");
	}

	practiceConsChaining(String name) {
		this(name, 2028489626);
	}

	practiceConsChaining(String name, int number) {
		this(name, number, "1604 spring hill rd");

	}

	practiceConsChaining(String name, int number, String Address) {
		this.myName = name;
		this.myNumber = number;
		this.myAddress = Address;

	}

	  void myinfo() {
		System.out.println("My name is: " + myName);
		System.out.println("My phone number is: " + myNumber);
		System.out.println("My current address is: " + myAddress);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practiceConsChaining show = new practiceConsChaining();
		show.myinfo();
	}

}
