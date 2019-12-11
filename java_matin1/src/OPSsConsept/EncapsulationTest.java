package OPSsConsept;

public class EncapsulationTest {

	public static void main(String[] args) {
		EncapsulationDemo obj = new EncapsulationDemo ();
		
		obj.setName("JABBAR");
		obj.setSsn(520445676);
		obj.setAge(28);
		
		System.out.println("NAME: " +obj.getName());
		System.out.println("SSN: " + obj.getSsn());
		System.out.println("AGE :" + obj.getAge());

	}

}
