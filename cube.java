import java.util.Scanner;

class cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lowercase character: ");
        char ch = sc.next().charAt(0);

        char result = Character.toUpperCase(ch);

        System.out.println("Uppercase = " + result);
    }
}