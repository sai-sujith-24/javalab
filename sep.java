class sep {
    public static void main(String[] args) {
        int[] a = {12, 7, 9, 20, 15, 8};

        System.out.println("Even Elements:");

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                System.out.print(a[i] + " ");
        }

        System.out.println("\nOdd Elements:");

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0)
                System.out.print(a[i] + " ");
        }
    }
}