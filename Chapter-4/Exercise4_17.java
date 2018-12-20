/*
Author: Chloee Stephenson
Date: 10/26/18
Exercise4_17
*/

import java.util.Scanner;

class Exercise4_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		System.out.print("Enter a month, only 3 letters please uppercase the first letter: ");
		String month = input.next();
		
		switch (month) {
			case "Jan":
			case "Mar":
			case "May":
			case "Jun":
			case "Aug":
			case "Oct":
			case "Dec":
				System.out.print("This month has 31 days");
				break;
			case "Apr":
			case "Jul":
			case "Sep":
			case "Nov":
				System.out.print("This month has 30 days");
				break;
			case "Feb":
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					System.out.print("This month has 29 days");				
				}
				else {
				System.out.print("This month has 28 days");
				}
		}
	
	}
}