public class PerfectNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i)) {
                System.out.println(i + " is a perfect number.");
                displayFactors(i);
            }
        }
    }

   
