/*
Author: Chloee Stephenson
Date: 11/1/18
This program will print a payroll statement
*/
import java.util.Scanner;

class Exercise4_23 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 double hours = 0.00;
		 double rate = 0.00;
		 double fedtax = 0.00;
		 double statax = 0.00;
		 double totded = 0.00;
		 double net = 0.00;
		 double gross = 0.00;
		
		System.out.print("Enter employee's name: ");
		String name = input.next();
		
		System.out.print("Enter the number of hours worked: ");
		hours = input.nextDouble();
		
		System.out.print("Enter the hourly pay rate: $");
		rate = input.nextDouble();
		
		System.out.print("Enter the federal tax withholding rate (please write in decimal form): ");
		fedtax = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate (please write in decimal form): ");
		statax = input.nextDouble();
		
		System.out.println(" ");
		System.out.println(" ");
				
		System.out.println("Employee name: " + name);
		
		System.out.println("Hours worked: " + hours);
		
		System.out.printf("Pay rate: $%.2f\n", rate);
		
		gross = (hours * rate);
		System.out.printf("Gross pay: $%.2f\n", gross);
		
		System.out.println("Deductions: ");
		
		System.out.print("     Federal withholding (" + fedtax);
		System.out.print("): " );
		System.out.printf("  $%.2f\n", gross * fedtax); 
		
		System.out.print("     State withholding: (" + statax);
		System.out.print("): ");
		System.out.printf("  $%.2f\n", gross * statax);
		totded = (gross * statax) + (gross * fedtax);
		
		System.out.printf("     Total deduction: $%.2f\n", totded);
		
		net = ((hours * rate) - (totded));
		System.out.printf("Net pay: $%.2f", net );
		
		
	}
}