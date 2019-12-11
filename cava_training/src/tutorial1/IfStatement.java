 package tutorial1;

public class IfStatement {
	public static void main(String[] args) {

		boolean number = 2 < 5;
		boolean number1 = 4 > 7;
		int ismatAge = 20;
		int hedayatAge = 15;

		boolean brother = ismatAge > hedayatAge;
		System.out.println("ismat is older then hedayat: " + brother);
		System.out.println("2 is less then 5 :" + number);
		System.out.println("4 is large then 7:" + number1);
		boolean notEqual = 4 != 6;
		System.out.println("Number 4 is not equal to number 6:" + notEqual);
		boolean equal = 6 == 6;
		System.out.println("6 is eqaul to 6:" + equal);
		if (5 == 5) {
			System.out.println("the statement is: " + true);

		 
		}

	}

}