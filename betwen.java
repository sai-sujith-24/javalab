class betwen {
    public static void main(String[] args) {
        int[] a = {10, 25, 35, 45, 30, 15};

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 20 && a[i] <= 40)
                count++;
        }

        System.out.println("Count = " + count);
    }
}