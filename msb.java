class msb {
    public static void main(String[] args) {
        int[] a = {10, 25, 7, 40, 18};

        int largest = a[0];
        int second = Integer.MIN_VALUE;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                second = largest;
                largest = a[i];
            } else if (a[i] > second && a[i] != largest) {
                second = a[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second);
    }
}