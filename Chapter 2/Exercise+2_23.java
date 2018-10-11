/*
Author: Chloee Stephenson
Date: 10/6/18

This will display the price of a trip
 */

import java.util.Scanner;

public class Exercise2_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dd = 0.0;
        double mpg = 0.0;
        double ppg = 0.0;
        double cost = 0.0;
        
        System.out.println("Enter the driving distance");
        dd = input.nextDouble();
        
        System.out.println("Enter the miles per gallon");
        mpg = input.nextDouble();
        
        System.out.println("Enter the price per gallon");
        ppg = input.nextDouble();
        
        cost = (dd / mpg) * ppg;
        
        System.out.println("The cost of driving is");
        System.out.print(cost);
        
    }
}
