class large {
    public static void main(String[] args) {
        int[] a = {10, 25, 7, 45, 18};

        int largest = a[0];
        int second = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                second = largest;
                largest = a[i];
            } else if (a[i] > second && a[i] != largest) {
                second = a[i];
            }
        }

        System.out.println("Second Largest = " + second);
    }
}