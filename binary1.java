import java.util.Scanner;

class binary1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {10, 20, 30, 40, 50, 60};

        System.out.print("Enter element: ");
        int target = sc.nextInt();

        int low = 0;
        int high = a.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == target) {
                found = true;
                break;
            } else if (a[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}