/*
Author: Chloee Stephenson
Date: 10/19/18
Finding the perimenter of a triangle if it is valid
*/

import java.util.Scanner;

class exercise3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the first side length");		
			int a = input.nextInt();
		
		System.out.println("Enter the next side length");		
			int b = input.nextInt();
		
		System.out.println("Enter the last side lenght");		
			int c = input.nextInt();
		
		int answer = a + b + c;
				 
		if ( a + b  > c && a + c > b && c + b > a ) {
			System.out.println( "This is valid   " + answer);
		
		}
		else
			System.out.println("This is invalid");
		
		
						
					
		
			}
}