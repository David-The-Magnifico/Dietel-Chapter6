public class PerfectNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i)) {
                System.out.println(i + " is a perfect number.");
                displayFactors(i);
            }
        }
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void displayFactors(int number) {
        System.out.print("Factors of " + number + ": 1");
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(", " + i);
            }
        }
        System.out.println();
    }
}
