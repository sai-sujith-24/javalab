import java.util.Scanner;

public class SecondsToTimeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total seconds: ");
        if (!sc.hasNextLong()) {
            System.out.println("Please enter a whole number.");
            return;
        }
        long totalSeconds = sc.nextLong();
        if (totalSeconds < 0) {
            System.out.println("Seconds cannot be negative.");
            return;
        }

        long hours = totalSeconds / 3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;
        System.out.println("Time: " + hours + " hour(s), " + minutes
                + " minute(s), " + seconds + " second(s)");
    }
}
