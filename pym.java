class pym {
    public static void main(String[] args) {
        int[] a = {25, 10, 5, 40, 15};

        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < smallest) {
                second = smallest;
                smallest = a[i];
            } else if (a[i] < second && a[i] != smallest) {
                second = a[i];
            }
        }

        System.out.println("Second Smallest = " + second);
    }
}