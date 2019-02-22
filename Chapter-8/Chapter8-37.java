/**
Author: Chloee Stephenson 
Date: 02/22/19
Description: Enter the capitls for a state, this reports if the capital is correct
**/


import java.util.Scanner;

class Exercise_08_37 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
		String[][] statesAndCapitals = getData();

		int count = 0;						
		
		for (int i = 0; i < statesAndCapitals.length; i++) {
			System.out.print("What is the capital of "
				+ statesAndCapitals[i][0] + "? ");
			String capital = input.nextLine();

			if (isEqual(statesAndCapitals[i][1], capital)) {
				System.out.println("Your answer is correct");
				count++;
			}
			else {
				System.out.println("The correct answer should be " + 
					statesAndCapitals[i][1]);
			}
		}

		
		System.out.println("\nThe correct count is " + count);
	}

	
	public static boolean isEqual(String c, String a) {
		if (c.length() != a.length())
			return false;

		for (int i = 0; i < c.length(); i++) {
			if (c.charAt(i) != a.charAt(i))
				return false;
		}

		return true;
	}

	
	public static String[][] getData() {
		String[][] d = {
			// 1
			{"Florida", "Tallahassee"}, 
			// 2
			{"Georgia", "Atlanta"},
			// 3
			{"Hawaii", "Honolulu"}, 
			// 4
			{"Idaho", "Boise"},
			// 5
			{"Tennessee", "Nashville"}, 
			// 6
			{"Texas", "Austin"}, 
			// 7
			{"Utah", "Salt Lake City"},
			// 8
			{"West Virginia", "Charleston"},
			// 9
			{"Wisconsin", "Madison"}, 
			// 10
			{"Wyoming", "Cheyenne"}};
		return d;
	}
}