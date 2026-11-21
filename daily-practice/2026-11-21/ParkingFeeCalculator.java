import java.util.Scanner;

public class ParkingFeeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter parked hours (1 to 24): ");
        if (!sc.hasNextInt()) {
            System.out.println("Please enter whole hours.");
            return;
        }
        int hours = sc.nextInt();
        if (hours < 1 || hours > 24) {
            System.out.println("Hours must be between 1 and 24.");
            return;
        }

        // Example charges for learning, not an actual parking tariff.
        int fee = 20;
        if (hours > 2) {
            fee += (hours - 2) * 10;
        }
        System.out.println("Parking Fee: Rs. " + fee);
    }
}
