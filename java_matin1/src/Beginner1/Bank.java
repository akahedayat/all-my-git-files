package Beginner1;

public class Bank {
	String bankName;
	int accountNumber;
	String accountName;
	String address;
	
	public Bank (String mybank, int accountNumber, String accountName, String address) {// parmerized constructor.
		
		this.bankName = mybank;
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		
	}
	
	public String school(String name) { // this is a method.
		
		
		return name;
	}
	
	int myNumber(int myNumber) {
		return myNumber;
		
	}
	
	
	public int showbalance(int h,int i, int g ) {// this is a parametirized method.
		 
		
		return h + i + g;	
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Bank united = new Bank("Bank Of America", 8734837, "Omid", "address");
		System.out.println(united.school("HEDAYAT"));
		
		System.out.println("Bank Name: "+united.bankName);
		System.out.println("My Account Number is: "+united.accountNumber);
		System.out.println("Account holder is: "+united.accountName);
		System.out.println("This is my current balance: "+united.showbalance(20, 10 , 5));
		System.out.println("address: 4534 Eastmoreland rd Annandale, VA 22405 ");

	}

}
