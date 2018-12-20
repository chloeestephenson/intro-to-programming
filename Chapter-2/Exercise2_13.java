/*
Author: Chloee Stephenson
Date: 10/6/18

This is a finance calculator
*/

import java.util.Scanner;

class Exercies2_13 {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		double month = 0.0;
                double interest = (1 + 0.00417);
                double month1 = 100 * interest;
		double finalvalue = 0.0;
		
		System.out.println("Enter the month to find the value");
		month = input.nextDouble();
                
                finalvalue = (100 + (month * (month1 * interest))) * interest;
                
                System.out.println("The month total is");
                System.out.println(finalvalue);
	}
}