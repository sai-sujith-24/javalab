class find {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 6};

        int n = 6;
        int total = n * (n + 1) / 2;

        int sum = 0;

        for (int i = 0; i < a.length; i++)
            sum = sum + a[i];

        System.out.println("Missing number = " + (total - sum));
    }
}