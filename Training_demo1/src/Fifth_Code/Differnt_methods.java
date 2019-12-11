package Fifth_Code;

public class Differnt_methods {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
//ABC();
ATT(10000, 5000, "January");
ATT(20000, 10000, "February");
ATT(25000, 8000, "March");
ATT(45000, 7000, "April");
ATT(87000, 9000, "May");
ATT(34000, 20000, "June");
ATT(65000, 9800, "July");
ATT(87880, 9500, "August");
ATT(98000, 8600, "September");
ATT(78000, 44000, "October");
ATT(890000, 76000, "November");
ATT(100000, 50000, "December");
 }
 
 //to calculate profit of a company
 /*public static void ABC () {
  int Income = 10000;
  int Expenses = 7000;
  int Profit = Income-Expenses;
  System.out.println("This is the profit of the company: "+Profit);
 }*/
 /*calculating monthly profit of ATT company. we write our code once and just call different
 months and values inside the main method*/
public static void ATT (int income, int expenses, String month) {
 int profit = income-expenses;
 int profitaftertax=profit-2000;
 System.out.println("Profit of AT&T for the month of: "+month +" = "+profit);
 System.out.println("This is netprofit after tax: "+profitaftertax);
 
}
}