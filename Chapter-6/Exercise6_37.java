/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chloee
 */
import java.util.Scanner;

public class Exercise6_37 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		
		System.out.print("Enter a number and its width (number, width): ");
                    int number = input.nextInt();
                    int width = input.nextInt();

		
		System.out.println(
                    number + " together with width " + width + ": " + format(number, width));
	}

	
	public static String format(int number, int width) {
            String num = number + ""; 
		
		
		if (num.length() < width) {
                    for (int i = width - num.length(); i > 0; i--) {
			num = 0 + num;
			}
		}
		return num;
	}
}

