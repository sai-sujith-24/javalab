import java.util.Scanner;

class gon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            if (b.indexOf(ch) != -1) {
                System.out.print(ch + " ");
            }
        }
    }
}