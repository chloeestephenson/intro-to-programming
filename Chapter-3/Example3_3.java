/*
Author: Chloee Stephenson
Date: 10/15/18
Description: This will prompt the user to enter a, b, c, d, e, f,
*/

import java.util.Scanner;

class Exercise3_3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double d = 0.0;
		double e = 0.0;
		double f = 0.0;
		double x = 0.0;
		double y = 0.0;
		
		System.out.print("Enter a: ");
			a = input.nextDouble ();
			
		System.out.print("Enter b: ");
			b = input.nextDouble ();
			
		System.out.print("Enter c: ");
			c = input.nextDouble ();
			
		System.out.print("Enter d: ");
			d = input.nextDouble ();
			
		System.out.print("Enter e: ");
			e = input.nextDouble ();
			
		System.out.print("Enter f: ");
			f = input.nextDouble ();
			
		if ((a * d - b * c) == 0){
			System.out.println("Cannot be divided by 0");
			
		}
		else {
			x = (e * d - b * f) / (a * d - b * c);
				System.out.println("The x = " + x);
				
			y = (a * f - e * c) / (a * d - b * c);
				System.out.println("The y = " + y);
			
		}
					
		
				}
		}	

