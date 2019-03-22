import java.util.Scanner;

public class MainDemo {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	double tax = 0;	
	
	final	double taxRate1 = 0.04;
	final	double taxRate2 = 0.08;
	final	double taxRate3 = 0.12;
	final	double taxRate4 = 0.16;
	final	double taxRate5 = 0.20;
	final	double taxRate6 = 0.24;
	
	System.out.println("enter your income");
	double income = sc.nextDouble();
	
if (income > 350000) {
	 tax = taxRate6*income; 
}
if (income > 300000) 
	 tax = taxRate5*income;
if (income > 250000) 
	 tax = taxRate4*income;
if (income > 200000) 
	 tax = taxRate3*income;
if (income > 150000) 
	 tax = taxRate2*income;
if (income > 100000) 
	 tax = taxRate1*income;
if (income < 100000) 
	 tax = 0;
	 
		double salary = income - tax;
		
		System.out.println(salary);
	}
}
