import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();
        System.out.print("Enter annual interest rate (%): ");
        double rate = input.nextDouble();
        System.out.print("Enter time in years: ");
        double years = input.nextDouble();

        if (!Double.isFinite(principal) || !Double.isFinite(rate)
                || !Double.isFinite(years) || principal < 0 || rate < 0 || years < 0) {
            System.out.println("Please enter non-negative, finite values.");
            return;
        }

        double interest = principal * rate * years / 100;
        System.out.printf("Simple Interest: %.2f%n", interest);
        System.out.printf("Total Amount: %.2f%n", principal + interest);
    }
}
