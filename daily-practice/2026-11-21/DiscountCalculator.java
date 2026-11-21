import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter original price: ");
        double price = input.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discountPercent = input.nextDouble();

        if (!Double.isFinite(price) || !Double.isFinite(discountPercent)
                || price < 0 || discountPercent < 0 || discountPercent > 100) {
            System.out.println("Price must be non-negative and discount must be from 0 to 100.");
            return;
        }

        double discount = price * discountPercent / 100;
        System.out.printf("Discount Amount: %.2f%n", discount);
        System.out.printf("Final Price: %.2f%n", price - discount);
    }
}
