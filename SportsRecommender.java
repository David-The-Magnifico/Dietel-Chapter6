import java.util.Scanner;

public class SportsRecommender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double temp = input.nextDouble();
        
        String recommendation = sportsRecommender(temp);
        
        System.out.println(recommendation);
    }
    
    public static String sportsRecommender(double temp) {
        if (temp >= 20 && temp <= 30) {
            return "It’s lovely weather for sports today!";
        } else if (temp >= 10 && temp <= 40) {
            return "It’s reasonable weather for sports today.";
        } else {
            return "Please exercise with care today, watch out for the weather!";
        }
    }
}
