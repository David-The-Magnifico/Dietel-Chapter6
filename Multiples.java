import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the first integer (or type 'quit' to exit): ");
            String input1 = scanner.next();

            if (input1.equals("quit")) {
                System.out.println("Exiting the program...");
                break;
            }

            System.out.print("Enter the second integer: ");
            int num1 = Integer.parseInt(input1);
            int num2 = scanner.nextInt();

            boolean isMultiple = isMultiple(num1, num2);
            System.out.println(num2 + " is a multiple of " + num1 + ": " + isMultiple);
        }
    }

    public static boolean isMultiple(int first, int second) {
        return second % first == 0;
    }
}
