package Beginner1;

public class Employee {

	public String emplName;
	public int emplSallary;
	public String emplAddress;

	public Employee() {

		this("Hedayat", 30000, "Hamid");
	}

	public Employee(String name, int sallary, String address) {

		this.emplName = name;
		this.emplSallary = sallary;
		this.emplAddress = address;
	}

	void emplInfo() { // why we write the void here in line 23?
		System.out.println(emplName);
		System.out.println(emplSallary);
		System.out.println(emplAddress);

	}

	public static void main(String[] args) {
		Employee obj = new Employee(); // what dot we write the object in line 33 for? 
		obj.emplInfo();

	}

}
