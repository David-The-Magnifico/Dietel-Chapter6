import java.util.Scanner;

public class RoundNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a double value (or enter 'quit' to exit): ");
        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            double y = Math.floor(x + 0.5);
            System.out.printf("Original number: %.2f, Rounded number: %.0f\n", x, y);

            System.out.print("Enter another double value (or enter 'quit' to exit): ");
        }

       
