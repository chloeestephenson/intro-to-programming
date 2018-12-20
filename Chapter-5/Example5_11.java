/*
Author: Chloee Stephenson
Date: 11/7/18
This shows numbers from 100 to 200 that are divisible by 5 or 6, but not both
*/

class Exercise5_11 {
	public static void main(String[] args) {
		
		int j = 0;
			
		System.out.println("Numbers that are divisible by 5 or 6");
		
		for (int i = 100; i <= 200; i++) {
			if ((i % 5 == 0) ^ (i % 6 == 0)){
				System.out.print(i + " ");
				j++;
				if (j == 10) {
					System.out.println(" ");
					j = 0;
				}
			}		
			
		}
	}
}