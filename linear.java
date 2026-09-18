import java.util.Scanner;

class linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {10, 20, 30, 40, 50};

        System.out.print("Enter element: ");
        int n = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}
