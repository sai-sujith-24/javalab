import java.util.Scanner;

public class FuelMileageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance travelled (km): ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a numeric distance.");
            return;
        }
        double distance = sc.nextDouble();
        System.out.print("Enter fuel used (litres): ");
        if (!sc.hasNextDouble()) {
            System.out.println("Please enter a numeric fuel amount.");
            return;
        }
        double fuel = sc.nextDouble();
        if (!Double.isFinite(distance) || !Double.isFinite(fuel)
                || distance < 0 || fuel <= 0) {
            System.out.println("Distance must be non-negative and fuel must be positive.");
            return;
        }

        System.out.printf("Fuel Mileage: %.2f km/l%n", distance / fuel);
    }
}
