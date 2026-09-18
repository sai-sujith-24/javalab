class col{
    static int smallest(int[] a) {
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }

        return min;
    }

    public static void main(String[] args) {
        int[] a = {25, 10, 45, 5, 30};

        System.out.println("Smallest = " + smallest(a));
    }
}