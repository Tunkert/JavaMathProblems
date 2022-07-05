import java.util.Scanner;
import java.util.Random;

public class OneStepEquations {
	public static void main(String[] args) {
		// create new scanner instance
		Scanner scan = new Scanner(System.in);

		// create new Random instance
		Random rand = new Random();

		// create upperbound (1 higher than actual)
		int upperbound = 101;

		String user_continue = "yes";

		while (!user_continue.equals("n")) {	
			// create two random values between 1 and 100
			int random_num_1 = rand.nextInt(upperbound);
			int random_num_2 = rand.nextInt(upperbound);

			// create variable for solution and calculate solution
			int solution = random_num_2 - random_num_1;

			// create problem
			System.out.println("Solve for x if x + " + random_num_1 + " = " + random_num_2 + ".");
			System.out.print("Enter your solution: ");

			// take in user answer
			int user_answer = scan.nextInt();

			// compare user answer to solution and give feedback
			if (user_answer == solution) {
				System.out.println("You are correct!");
			} else {
				System.out.println("I'm sorry, you are incorrect.");
			}

			// ask user if they want another problem
			System.out.print("Do you want another problem? (y for yes, n for no): ");

			// take in whether they want to continue or not
			scan.nextLine();
			user_continue = scan.nextLine();

		}
	}
}