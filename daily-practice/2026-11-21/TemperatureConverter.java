import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose conversion (1 or 2): ");
        int choice = input.nextInt();

        if (choice != 1 && choice != 2) {
            System.out.println("Invalid choice. Enter 1 or 2.");
            return;
        }

        System.out.print("Enter temperature: ");
        double temperature = input.nextDouble();
        if (!Double.isFinite(temperature)) {
            System.out.println("Enter a finite temperature.");
            return;
        }

        if (choice == 1) {
            System.out.printf("Fahrenheit: %.2f%n", temperature * 9 / 5 + 32);
        } else {
            System.out.printf("Celsius: %.2f%n", (temperature - 32) * 5 / 9);
        }
    }
}
