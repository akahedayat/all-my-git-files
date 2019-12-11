package tek_begginers;

public class EncapsulationTest1 {

	public static void main(String[] args) {
		
		A_EncapsulationDemo obj = new A_EncapsulationDemo();
		//why object? giving value to variables and printing the value of variables
		
		obj.setSsn(64643665);
		obj.setEmpName("jamil");
		obj.setEmpAge(28);
		
		System.out.println("Employee SSN: "+obj.getSsn());
		System.out.println("Employee Name: "+obj.getEmpName());
		System.out.println("Employee age: " +obj.getEmpAge());
 
	}

}
