import java.util.Scanner;

class ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {10, 20, 10, 30, 10, 40};

        System.out.print("Enter element: ");
        int n = sc.nextInt();

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == n)
                count++;
        }

        System.out.println("Frequency = " + count);
    }
}