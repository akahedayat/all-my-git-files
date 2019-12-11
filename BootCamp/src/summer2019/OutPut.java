package summer2019;

public class OutPut extends CoreJava_Q4{
	
	int numofPrinciples = 5;
	@Override
	int priciple() {
 		System.out.println("our school has " + numofPrinciples + " principles");
 		
 	return numofPrinciples;
	}

	@Override
	void teacher() {
		System.out.println("I am from teachr method");
 		 
	}

	@Override
	void Student() {
		System.out.println("I am from student mehtod");
 		 
	}
	
 public String showMethod(){
	 
	 return all();
	 
 }
 
	public static void main(String[] args) {
		OutPut obj =new OutPut();
		
		obj.priciple();
		obj.teacher();
		obj.Student();
		obj.showMethod();
	}
	

}
