import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter electricity units consumed: ");
        double units = input.nextDouble();

        if (!Double.isFinite(units) || units < 0) {
            System.out.println("Units must be a non-negative number.");
            return;
        }

        // Example slab rates for learning only, not an official electricity tariff.
        double bill;
        if (units <= 100) {
            bill = units * 1.50;
        } else if (units <= 200) {
            bill = 100 * 1.50 + (units - 100) * 2.50;
        } else {
            bill = 100 * 1.50 + 100 * 2.50 + (units - 200) * 4.00;
        }
        System.out.printf("Electricity Bill: Rs. %.2f%n", bill);
    }
}
