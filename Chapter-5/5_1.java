/*
Author: Chloee Stephenson
Date:11/19/18
Descrption: This program reads an unspecified number of interegers, determines how many positive and negative values have been read and then computes the total. This program will end with 0.
*/

import java.util.Scanner;
class Exercise5_1 {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			 int userin = 0;
			 int countp = 0;
			 int countn = 0;
			 int total = 0;
			
			System.out.print("Enter a positive or negative number: ");
			userin = input.nextInt();
						
			while (userin != 0) {
								
				if (userin < 0) {
					countn ++;
				}
				if (userin > 0) {
					countp ++;
				}	
								
			}
			
			
			
			System.out.print("Positive numbers: " + countp);
			System.out.print("Negative numbers: " + countn);
			total = countp + countn;
			System.out.print("The total is " + total);
			
	}
}
