import java.util.Scanner;

public class ParkingCharges {
    public static double calculateCharges(double hoursParked) {
       
        double minFee = 2.00;
        double maxFee = 10.00;
        double additionalHourlyFee = 0.50;
        int maxParkingHours = 3;

        if (hoursParked <= maxParkingHours) {
            return minFee;
        } else {
            double totalFee = minFee + (hoursParked - maxParkingHours) * additionalHourlyFee;
            return Math.min(totalFee, maxFee);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalReceipts = 0.0;

        while (true) {
            System.out.print("Enter the hours parked (or enter 'quit' to exit): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                break;
            } else {
                double hours = Double.parseDouble(input);
                double charge = calculateCharges(hours);
                totalReceipts += charge;
                System.out.printf("Customer charge: $%.2f\n", charge);
            }
        }

        System.out.printf("Total receipts for yesterday: $%.2f\n", totalReceipts);
    }
}
