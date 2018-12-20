/* 
Author: Chloee Stephenson
Date: 10/26/18
Exercise 4-1
*/
import java.util.Scanner;

class Exercise4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the length from the center to the vertex: ");
		double r = input.nextDouble();
		
		double s = (r + r) * Math.sin(Math.PI / 5);
		double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));
		
		System.out.print("The area of the pentagon is " + area);
	}
}