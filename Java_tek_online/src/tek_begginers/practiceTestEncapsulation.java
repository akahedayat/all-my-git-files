package tek_begginers;

public class practiceTestEncapsulation {

	public static void main(String[] args) {
		
		practicEncapsulation position = new practicEncapsulation();
		
		position.setName("omid");
		position.setPhoneNumber(571354353);
		position.setAddress("Frederecksbug");
		position.setDOB(2018);
		
		System.out.println("My name is: " + position.getName());
		System.out.println("My phone number is: " + position.getPhoneNumber());
		System.out.println("My current addres is : " +position.getAddress());
		System.out.println("My date of birth is : " +position.getDOB());
		


	}

}
