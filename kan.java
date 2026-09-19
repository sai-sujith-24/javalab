class kan {
    public static void main(String[] args) {
        int[] a = {-5, 10, -3, 20, 15};

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0)
                sum += a[i];
        }

        System.out.println("Positive Sum = " + sum);
    }
}