class bet {
    public static void main(String[] args) {
        int[] a = {15, 7, 25, 10, 30};

        int largest = a[0];
        int smallest = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest)
                largest = a[i];

            if (a[i] < smallest)
                smallest = a[i];
        }

        System.out.println("Difference = " + (largest - smallest));
    }
}