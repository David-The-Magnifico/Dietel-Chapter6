import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a double value (or enter 'quit' to exit): ");
        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            roundToInteger(x);
            roundToTenths(x);
            roundToHundredths(x);
            roundToThousandths(x);

            System.out.print("Enter another double value (or enter 'quit' to exit): ");
        }

        System.out.println("Exiting the program.");
    }

    public static void roundToInteger(double number) {
        double rounded = Math.floor(number + 0.5);
        System.out.printf("Original: %.4f, Rounded to Integer: %.0f\n", number, rounded);
    }

    public static void roundToTenths(double number) {
        double rounded = Math.floor(number * 10 + 0.5) / 10;
        System.out.printf("Original: %.4f, Rounded to Tenths: %.1f\n", number, rounded);
    }

    public static void roundToHundredths(double number) {
        double rounded = Math.floor(number * 100 + 0.5) / 100;
        System.out.printf("Original: %.4f, Rounded to Hundredths: %.2f\n", number, rounded);
    }

    public static void roundToThousandths(double number) {
        double rounded = Math.floor(number * 1000 + 0.5) / 1000;
        System.out.printf("Original: %.4f, Rounded to Thousandths: %.3f\n", number, rounded);
    }
}
