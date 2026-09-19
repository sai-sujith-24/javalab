import java.util.Scanner;

class up {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase");
        else
            System.out.println("Not Uppercase");
    }
}