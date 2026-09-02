class inn {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 6, 7, 8};

        int n = 8;
        int expected = n * (n + 1) / 2;

        int actual = 0;

        for (int i = 0; i < a.length; i++) {
            actual += a[i];
        }

        System.out.println("Missing Number = " + (expected - actual));
    }
}