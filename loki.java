import java.util.Scanner;

class loki{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int middle = str.length() / 2;

        System.out.println("Middle Character = " + str.charAt(middle));
    }
}