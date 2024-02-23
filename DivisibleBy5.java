import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();

            boolean isDivisibleBy5 = isDivisible(num);
            System.out.println(num + " is divisible by 5: " + isDivisibleBy5);
        }
    }

    public static boolean isDivisible(int number) {
        return number % 5 == 0;
    }
}
