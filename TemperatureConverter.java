import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature: ");
        double temperature = input.nextDouble();
        System.out.print("Enter the unit (C for Celsius, K for Kelvin): ");
        char unit = input.next().charAt(0);

        if (unit == 'C') {
            System.out.println("Kelvin equivalent: " + celsiusToKelvin(temperature));
        } else if (unit == 'K') {
            System.out.println("Celsius equivalent: " + kelvinToCelsius(temperature));
        } else {
            System.out.println("Invalid unit.");
        }
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}
