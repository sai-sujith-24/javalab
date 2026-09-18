import java.util.Scanner;

class som{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {2, 7, 11, 15, 3, 6};

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    System.out.println(a[i] + " + " + a[j] + " = " + target);
                }
            }
        }
    }
}