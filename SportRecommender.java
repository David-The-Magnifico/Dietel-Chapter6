import java.util.Scanner;

public class SportRecommender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double temperature = input.nextDouble();
        System.out.println(sportsRecommender(temperature));
    }

    public static String sportsRecommender(double temperature) {
        if (temperature >= 20 && temperature <= 30) {
            return "It’s lovely weather for sports today!";
        } else if (temperature > 10 && temperature < 40) {
            return "It’s reasonable weather for sports today.";
        } else {
            return "Please exercise with care today, watch out for the weather!";
        }
    }
}
