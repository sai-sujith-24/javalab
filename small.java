class small {
    public static void main(String[] args) {
        int[] a = {25, 10, 45, 7, 18};

        int smallest = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < smallest)
                smallest = a[i];
        }

        System.out.println("Smallest = " + smallest);
    }
}
