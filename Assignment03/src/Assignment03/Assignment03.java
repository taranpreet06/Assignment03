package Assignment03;
/*
 * Student Name: Stanley Pieda (professor)
 * Lab Professor: Stanley Pieda (professor)
 * Due Date: The due date
 * Description: Sample solution for Assignment 03 (21S)
 */

/*
 * Simple class that simulates rolling a 20 sided dice.
 */
public class Assignment03 {

	/*
	 * Entry point for the application.
	 */
	public static void main(String[] args) {
		int roll = 0;
		int[] diceRolls = new int[20];
		int totalRolls = 0;

		// sample the rolls
		for(int count = 0; count < 1000; count++) {
		    roll = (int)(Math.random() * 20) + 1;
		    diceRolls[roll - 1] = diceRolls[roll - 1] + 1; // crashes for now
		}	
		// run a report
		for(int index = 0; index < diceRolls.length; index++) {
		    System.out.printf("Count of %d is: %d%n", (index + 1), diceRolls[index]);
		    totalRolls = totalRolls + diceRolls[index];
		}
		System.out.println("Total rolls were: " + totalRolls);
		System.out.println("Program by Stanley Pieda");

	}

}
