import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		// Declare Scanner and Array
		Scanner input = new Scanner(System.in);
		double[] cookie = new double[10];
		
		//Populate Arrat Elements
		System.out.print("Enter 10 double values: ");
		for (int index = 0; index < 10; index++) {
			cookie[index] = input.nextDouble();
		}
		
		//Call the min meod and display
		System.out.println("The minimum element is " + min(cookie));
	}
	
	public static double min(double[] array) {
		double min = array[0];
		
		//Search throgh array 
		for (int i = 1; i < 10; i++) {
			if (array[i] < min){ 
				min = array[i];
			}
		}
		
		//Return min
		return min;
	}
}