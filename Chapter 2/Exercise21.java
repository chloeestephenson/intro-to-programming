/*
Author: Chloee Stephenson
Date: 10/3/18
Project: 2-1
This will convert celcius to fahrenheit
 */
import java.util.Scanner;

class  Exercise21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double celcius = 0.0;
		double fahrenheit = 0.0;
		
		System.out.println("Converting Celcius to Fahrenheit");
		
		System.out.println("Enter the Celcius Value");
		celcius = input.nextDouble();
		
		fahrenheit = (9/5) * celcius + 32;
		
		System.out.println("The Fahrenheit degrees is");
		System.out.println(fahrenheit);
	}
}