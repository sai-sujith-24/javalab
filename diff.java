class diff{
    public static void main(String[] args) {
        int[] a = {10, 5, 25, 8, 30};

        int min = a[0];
        int maxDifference = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] - min > maxDifference)
                maxDifference = a[i] - min;

            if (a[i] < min)
                min = a[i];
        }

        System.out.println("Largest Difference = " + maxDifference);
    }
}