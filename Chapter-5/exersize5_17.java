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

public class exersize5_17 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int x = 0;
        System.out.println("Enter a number (1-15): ");
		x = input.nextInt();
           int rows = x;
 
           for (int i = 1; i <= rows; i++) {
                  for (int j = 1; j <= (rows - i)*2; j++) //create initial spacing.
                        System.out.print(" ");
                  
                  for (int k = i; k >= 1; k--) //creates left half.
                        System.out.print(" "+ k);
                  
                  for (int k = 2; k <= i; k++)//creates right half.
                        System.out.print(" "+ k);
                  
                  System.out.println();
           }
    }
 }
