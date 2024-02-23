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

    

        System.out.printf("Total receipts for yesterday: $%.2f\n", totalReceipts);
    }
}
