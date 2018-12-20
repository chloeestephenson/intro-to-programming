/*
Author: Chloee Stephenson
Date: 10/24/18
Description: Decides if the point is inside the rectangle 
*/

import java.util.Scanner;

class Example3_23 {
	public static void main(String[] args) {
		double x = 0.0;
		double y = 0.0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the x value: ");
		x = input.nextInt();
		System.out.print("Enter the y value: ");
		y = input.nextInt();
		
		
		if ( (x < 5 && x > -5) && (y < 2.5 && y > -2.5)) {
			System.out.print("Point ");
			System.out.print("(" + x + ", " + y +")" + " is in the rectangle.");
		}
		else {
			System.out.print("Point ");
			System.out.print("(" + x + ", " + y +")" + " is not in the rectangle.");
		}
					
	}
}