import java.util.Scanner;

class convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        System.out.println("Lowercase = " + Character.toLowerCase(ch));
    }
}