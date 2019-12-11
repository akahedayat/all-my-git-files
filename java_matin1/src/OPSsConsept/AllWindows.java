package OPSsConsept;

public class AllWindows {

	public static void main(String[] args) {

		WindowOne obj1 = new WindowOne("blue color glass", 2, 4);
		
		System.out.println(obj1.glasses);
		System.out.println(obj1.house());
		
		
		WindowTow obj2 = new WindowTow("white glass color", 3, 6);
		
		
		System.out.println(obj2.glasses);
		System.out.println(obj2.house());
	}

}
