import java.util.Random;
import java.util.Scanner;

public class CoinTossing {
    enum Coin {
        HEADS, TAILS
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int headsCount = 0;
        int tailsCount = 0;

        while (true) {
            System.out.println("1. Toss Coin");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();

            if (choice == 1) {
                Coin result = flip();
                System.out.println("Result: " + result);
                if (result == Coin.HEADS) {
                    headsCount++;
                } else {
                    tailsCount++;
                }
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid option");
            }
        }

        System.out.println("Heads count: " + headsCount);
        System.out.println("Tails count: " + tailsCount);
    }

    public static Coin flip() {
        Random random = new Random();
        return random.nextBoolean() ? Coin.HEADS : Coin.TAILS;
    }
}
