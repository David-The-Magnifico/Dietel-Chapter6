import java.util.Scanner;

public class SumOfDigitsCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a four-digit number: ");
        int number = input.nextInt();
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits: " + sum);
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
