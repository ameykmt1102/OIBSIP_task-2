package numbergame;
/*This is a Simple Program Of Number Guessing Game which consists of total 3 Rounds
 You only reach the next round after completion of Previous Round and Score Accordingly 
 */
import java.util.*;

public class NewGame {

	int chance = 0;
	int score = 0;
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	int randomNumber;
	int round = 1;
	int tries = 9;

	public static void main(String[] args) {
		NewGame a = new NewGame();
		Scanner sc = new Scanner(System.in);

		System.out.println("*******************************************************************");
		System.out.println("**************Welcome To The Number Guessing Game******************");
		System.out.println("*******************************************************************");

		// Menu driven options
		while (true) {
			System.out.println("\n\tSelect Your Choice (1 or 2) ?: \n\n1)Play New Game \n2)EXIT");
			System.out.print("\nEnter Choice :");
			int choice = sc.nextInt();

			switch (choice) {

				case 1:
					a.game2();

				case 2:
					System.out.println("Thank You For Showing Interest :).....Be Back Soon!!!");
					System.exit(0);
				default:
					System.out.println("Invalid Choice :(");
			}
		}
	}

	// checking the user entered number is higher or lower
	public void checkLowerOrHigher(int userGuess) {
		if (randomNumber > userGuess) {
			System.out.println("Take A Higher guess please..");

		} else if(userGuess>100 || userGuess<1) {
			System.out.println("Please Enter a Number BETWEEN THE RANGE 1 and 100");

		}else {
			System.out.println("Take A lower guess please..");
		}
	}

	// Method to implement on 'a' object of class NewGame
	public void game2() {

		// This for loop is for selecting rounds
		for (int i = 1; i <= 3; i++) {
			System.out.println("\n\tEntering Round " + i);

			// If it iterates 1 then give -> 9 chances
			if (i == 1) {
				System.out.println("\nDifficulty : EASY!");
				randomNumber = r.nextInt(100) + 1;
				// Here 'tries' is getting used from global scope
				System.out.println("\n\nEnter Your Guess within maximum of " + tries + " tries(1-100)");

				// Iterating 9 chances ->
				for (int j = 9; j >= 1; j--) {

					    
					// Taking the input in userGuess object
					System.out.println("\nYour Guess -> ");
					int userGuess = sc.nextInt();

					// Here 'chance' is getting used from global scope
					chance++;
					System.out.println("\nCHANCES YOU TOOK: " + chance);

					// Main logic
					if (chance == tries) {
						System.out.println("Sorry...Out of Tries :(..........Play Again");
						System.exit(0);

					} else if (userGuess == randomNumber) {
						score += 20;
						round += 1;

						System.out.println(
								"The Number Guessed Is Correct!! Congrats You won 20 points!!\nScore =" + score);

						System.out.println("\nThe Random Number Generated by the system is :" + randomNumber);
						System.out.println("The Number of tries you took to Guess the Number : " + chance);
						// round();

						System.out.println("\n\tAdvancing to round " + round);
						break;
					}
					checkLowerOrHigher(userGuess);
					// System.out.println(j);
					// System.out.println("*****");
				}
			} else if (i == 2) {// when round -> 2
				System.out.println("\nDifficulty : MEDIUM !");
				randomNumber = r.nextInt(100) + 1;
				// Here 'chance' is being used from local scope
				int chance = 0;
				// Here 'tries' is being used from local scope
				int tries = 6;
				System.out.println("\n\nEnter Your Guess within maximum of " + (tries) + " tries(1-100)");

				// Iterating 6 chances ->
				for (int k = 6; k >= 1; k--) {

					System.out.println("\nYour Guess -> ");
					int userGuess = sc.nextInt();
					chance++;
					System.out.println("\nCHANCES YOU TOOK: " + chance);

					if (chance == tries) {
						System.out.println("Sorry...Out of Tries :(.........WELL PLAYED!");
						System.exit(0);

					} else if (userGuess == randomNumber) {
						score += 20;
						round += 1;

						System.out.println(
								"The Number Guessed Is Correct!! Congrats You won 20 points!!\nScore =" + score);

						System.out.println("\nThe Random Number Generated by the system is :" + randomNumber);
						System.out.println("The Number of tries you took to Guess the Number : " + chance);

						System.out.println("\n\tAdvancing to round " + round);// replace with round ->sure
						break;
					}
					checkLowerOrHigher(userGuess);// calling check function defined above

				}
			} else if (i == 3) {// when round->3
				System.out.println("\nDifficulty : HARD !");
				randomNumber = r.nextInt(100) + 1;
				// Here 'chance' is being used from local scope
				int chance = 0;
				// Here 'tries' is being used from local scope
				int tries = 3;
				System.out.println("\n\nEnter Your Guess within maximum of " + (tries) + " tries(1-100)");

				for (int m = 3; m >= 1; m--) {

					System.out.println("\nYour Guess -> ");
					int userGuess = sc.nextInt();
					chance++;
					System.out.println("\nCHANCES YOU TOOK: " + chance);

					if (chance == tries) {
						System.out.println("Sorry...Out of Tries :(..........Play Again");
						System.exit(0);

					} else if (userGuess == randomNumber) {
						score += 20;
						round += 1;

						System.out.println(
								"The Number Guessed Is Correct!! Congrats You won 20 points!!\nScore =" + score);

						System.out.println("\nThe Random Number Generated by the system is :" + randomNumber);
						System.out.println("The Number of tries you took to Guess the Number : " + chance);

						break;
					}
					checkLowerOrHigher(userGuess);

				}

			}
			System.out.println("\n/////--------/////");

		}

	}

}
