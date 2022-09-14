package studio2;
import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How much money did you start with?");
		double startAmount = in.nextDouble();

		System.out.println("What is the probability that you will win a single game?");
		double winChance = in.nextDouble();
		
		System.out.println("What is your money goal for the day?");
		double winLimit = in.nextDouble();
		
		System.out.println("How many simulations do you want to run?");
		int totalSimulations = in.nextInt();
		
		boolean gameEnd = false;
		int simulationsRun = 0;
		
		for (int x = 1; x <= totalSimulations; x++) {
			
			double currentAmount = startAmount;
			while (gameEnd == false) {
				double roundResult = Math.random();
				simulationsRun = 0;
				if (roundResult > (1 - winChance)){
					currentAmount++;
					
				}
				else {
					currentAmount = currentAmount - 1;
					
				}
				if (currentAmount >= winLimit) {
					gameEnd = true;
					System.out.println("WIN");
				}
				else if (currentAmount <= 0) {
					gameEnd = true;
					System.out.println("LOSE");
				}
				else {
					gameEnd = false;
					
			}
				simulationsRun++;

			
		}
				System.out.println("Simulation " + x + ": " + simulationsRun);


	}

}
}
