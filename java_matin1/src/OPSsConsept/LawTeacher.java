package OPSsConsept;

public class LawTeacher extends Teacher {
	String subject = "LeagalTermonology";

	public static void main(String[] args) {
		
		LawTeacher obj =new LawTeacher();
		
		System.out.println(obj.getDesignation());
		System.out.println(obj.getCollegeName());
		System.out.println(obj.subject);
		obj.job();
		

	}

}
