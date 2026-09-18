import java.util.Scanner;

class pal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        String num = sc.next();

        String rev = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            rev += num.charAt(i);
        }

        if (num.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}