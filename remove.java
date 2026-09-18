public class remove {
    public static void main(String[] args) {
        int[] a = {10, 20, 10, 30, 20, 40};

        for (int i = 0; i < a.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(a[i] + " ");
            }
        }
    }
} 

