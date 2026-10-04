import java.util.Scanner;

class last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        char[] a = str.toCharArray();

        char temp = a[0];
        a[0] = a[a.length - 1];
        a[a.length - 1] = temp;

        System.out.println("Result = " + new String(a));
    }
}