import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(1000) + 1;

        while (true) {
            System.out.print("Guess a number between 1 and 1000: ");
            int guess = input.nextInt();

            if (guess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Congratulations. You guessed the number!");
                System.out.print("Do you want to play again? (yes/no): ");
                String playAgain = input.next();
                if (playAgain.equalsIgnoreCase("no")) {
                    break;
                } else {
                    numberToGuess = random.nextInt(1000) + 1;
                }
            }
        }
    }
}
